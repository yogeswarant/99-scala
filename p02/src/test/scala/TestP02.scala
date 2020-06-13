import org.scalatest._
import in.everyogi.p02.P02

class TestP02 extends FlatSpec {
  "penultimate " should "return penultimate value of the list" in {
    val l = List(1, 2, 3, 4)
    assert(P02.penultimate(l) == 3)
  }
}
