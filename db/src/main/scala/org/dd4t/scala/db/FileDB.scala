package org.dd4t.scala.db

import scala.io.Source

/**
  * Created by fbenitez on 05/05/2016.
  */
object FileDB extends DB {
  override def getPageByPath(path: String) = {
    val jsonPath = "/brokerjson/" + path.replace(".html", ".json")
    val stream = getClass.getResourceAsStream(jsonPath)
    Source.fromInputStream(stream).mkString
  }
}
