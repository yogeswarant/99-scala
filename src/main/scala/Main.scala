package in.everyogi.scala99

import in.everyogi.p01.P01
import in.everyogi.p02.P02

object Main extends App {
  val l = List(2, 5, 6, 8)
  println(s"Last of $l is ${P01.last(l)}")
  println(s"Penultimate of $l is ${P02.penultimate(l)}")
}
