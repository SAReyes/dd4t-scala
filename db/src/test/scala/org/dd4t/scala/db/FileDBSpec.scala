package org.dd4t.scala.db

import org.scalatest._

/**
  * Created by fbenitez on 05/05/2016.
  */
class FileDBSpec extends FlatSpec with Matchers {

  "File DB" should "return something" in {
    val db : DB = FileDB
    db.getPageByPath("mastheada.html") should not be empty
  }
}
