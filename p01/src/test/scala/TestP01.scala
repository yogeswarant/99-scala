import org.scalatest._
import in.everyogi.p01.P01

class TestP01 extends FlatSpec {
  "last " should "return last value of the list" in {
    val l = List(1, 2, 3, 4)
    assert(P01.last(l) == 4)
  }
}
