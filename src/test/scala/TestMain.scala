import org.scalatest._
import in.everyogi.scala99.Main

class TestMain extends FlatSpec {
  "main " should "get executed successfully" in {
    var args:Array[String] = new Array[String](1)
    Main.main(args)
  }
}
