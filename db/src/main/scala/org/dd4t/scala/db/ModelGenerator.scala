package org.dd4t.scala.db


import com.typesafe.config.ConfigFactory
import slick.codegen.SourceCodeGenerator
import slick.driver.H2Driver
import slick.driver.H2Driver.api._

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by fbenitez on 06/05/2016.
  */
object ModelGenerator {

  def main(args: Array[String]) {

    val db = Database.forConfig("h2memDD4T",
      ConfigFactory.load("db/db.conf"))

    val modelAction = H2Driver.createModel(Some(H2Driver.defaultTables))
    val modelFuture = db.run(modelAction)

    val codegenFuture = modelFuture.map( model => new SourceCodeGenerator(model) {

      override def Table = new Table(_) {
        println("find a table " + model.name)
        // disable entity class generation and mapping
        override def EntityType = new EntityType{
          override def classEnabled = false
        }

        override def Column = new Column(_) {
          override def rawType = {
            var res = super.rawType
            println(model.name + " " + model.tpe + " " + res.getClass)
            if (model.tpe == "scala.math.BigDecimal") {
              println("cambiado")
              "Int"
            } else res
          }
        }
      }
    })

    codegenFuture.onSuccess {
      case codegen => {
        codegen.writeToFile("slick.driver.H2Driver",
          "db/src/main/scala/",
          "org.dd4t.scala.db.model",
          "Tables")
        synchronized { notify }
      }
    }
    codegenFuture.onFailure {
      case error => println("error")
    }

    //import scala.concurrent.duration._
    //Await.result(codegenFuture, 10000 millis)

    codegenFuture.onComplete {
      case _ => {
        println("notify")
      }
    }
    synchronized {
      println("wait")
      wait
    }

    println("finish")

    /*
    slick.codegen.SourceCodeGenerator.main(
      Array("slick.driver.H2Driver",
        "org.h2.Driver",
        "jdbc:h2:mem:test;MODE=ORACLE;INIT=create schema if not exists test\\;runscript from 'classpath:db/CD_BROKER_TABLES.sql'",
        "db/src/main/scala/",
        "org.dd4t.scala.db.model")
    )
    */
  }

}
