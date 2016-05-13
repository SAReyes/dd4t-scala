package org.dd4t.scala.db

import com.typesafe.config.ConfigFactory
import org.dd4t.scala.db.model.Tables.UndoLog
import org.scalatest._
import slick.driver.H2Driver.api._

/**
  * Created by fbenitez on 05/05/2016.
  */
class DD4TDBSpec extends FlatSpec with Matchers {
  val components = TableQuery[UndoLog]

  "Memory DB" should "return something" in {
    val db = Database.forConfig("h2memSimpleNoInit",
      ConfigFactory.load("db/db.conf"))
    /*
    val setup = DBIO.seq(
     components.schema.create,
      components += ("1", "Test 1", ""),
      components += ("2", "Test 2", "")
    )

    val setupFuture = db.run(setup)

    Await.result(db.run(components.result), Duration.Inf).foreach {
      case(id, value) => println(" " + id + " value " + value)
    }
    */
  }
}



