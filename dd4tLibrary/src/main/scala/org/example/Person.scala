package org.example

/**
  * Created by AReyes on 04/05/16.
  */
class Person(val name: String) {

  def hello() = s"Hey, $name!"
}

object Person {
  def apply(name: String): Person = new Person(name)
}
