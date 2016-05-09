package org.dd4t.scala.db


import com.typesafe.config.ConfigFactory
import slick.driver.H2Driver.api._

/**
  * Created by fbenitez on 05/05/2016.
  */
class MemoryDB(private val db : Database) extends DB {
  override def getPageByPath(path: String): String =  {
    return ""
  }
}

object MemoryDB {
  def apply() = {
    val db = Database.forConfig("h2mem1",
      ConfigFactory.load("db/db.conf"))
    new MemoryDB(db)
  }
}

