package stdlib

import org.scalatest._

object TestAssert{
  def main (args: Array[String]) {
      val left = 2
      val right = 1
      assert (left == right)
    }
}
