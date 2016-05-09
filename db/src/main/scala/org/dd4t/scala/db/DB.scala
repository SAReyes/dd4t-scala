package org.dd4t.scala.db

/**
  * Created by fbenitez on 05/05/2016.
  */
abstract class DB {
  def getPageByPath(path : String) : String;
}
