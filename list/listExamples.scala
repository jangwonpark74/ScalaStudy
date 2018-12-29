
// For an immutable sequence of objects that share 
// the same type you can use Scala's List class

object ListExamples {
  def main(args: Array[String]) {
    val a = List(1,1,2,3,5,8)

    println("last element of list="+a.last)

    println("a's length = "+a.length)

    println("a's reverse="+a.reverse)
  }
}
