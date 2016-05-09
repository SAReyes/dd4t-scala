package org.dd4t.scala.db


import com.typesafe.config.ConfigFactory
import org.scalatest._
import slick.driver.H2Driver.api._
import slick.lifted
import slick.lifted.ProvenShape

import scala.concurrent.Await
import scala.concurrent.duration.Duration

/**
  * Created by fbenitez on 05/05/2016.
  */
class SimpleDBSpec extends FlatSpec with Matchers {
  val components = TableQuery[Simple]

  "Memory DB" should "return something" in {
    val db = Database.forConfig("h2memSimpleNoInit",
      ConfigFactory.load("db/db.conf"))
    val setup = DBIO.seq(
     components.schema.create,
      components += (1, "Test 1"),
      components += (2, "Test 2")
    )

    val setupFuture = db.run(setup)

    Await.result(db.run(components.result), Duration.Inf).foreach {
      case(id, value) => println(" " + id + " value " + value)
    }
  }
}


class Simple(tag : lifted.Tag) extends Table[(Int, String)](tag, "Simple") {
  def id = column[Int]("Id", O.PrimaryKey)
  def valor = column[String]("valor")

  override def * : ProvenShape[(Int, String)] = (id, valor)
}
