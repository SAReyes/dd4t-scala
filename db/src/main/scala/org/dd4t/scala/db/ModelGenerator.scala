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

      override val ddlEnabled = false

      override def Table = new Table(_) {

        override def TableClass = new TableClassDef {
          override def star = {
            s"def * = ???"
          }
          override def option = {
            s"def ? = ???"
          }

        }
        // disable entity class generation and mapping
        override lazy val EntityType = new EntityType{
          override val classEnabled = false
        }

        override lazy val PlainSqlMapper = new PlainSqlMapper{
          override val enabled = false
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


    codegenFuture.onComplete {
      case _ => {
        println("notify")
      }
    }
    synchronized {
      println("wait")
      wait
    }

    println("finish remember add implicit def string2BigDecimal(value: String) = new scala.math.BigDecimal(new java.math.BigDecimal(value))")

  }

}
