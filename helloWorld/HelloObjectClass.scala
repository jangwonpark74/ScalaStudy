
class HelloClass {
  def inClass =
    println("In class")
  
}

object HelloObjectClass {
  println("In object")

  def main(args: Array[String]) {
    println("In main")
    val c = new HelloClass
    c.inClass
  }
}
