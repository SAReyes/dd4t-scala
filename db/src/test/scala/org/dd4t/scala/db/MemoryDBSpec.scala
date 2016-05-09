package org.dd4t.scala.db

import org.scalatest._

/**
  * Created by fbenitez on 05/05/2016.
  */
class MemoryDBSpec extends FlatSpec with Matchers {

  "Simple Test Db" should "works" in {
    val db = MemoryDB()
    db.getPageByPath("mastheada.html") should not be empty
  }
}


