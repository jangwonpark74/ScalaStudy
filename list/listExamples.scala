
// For an immutable sequence of objects that share 
// the same type you can use Scala's List class

object ListExamples {
  def main(args: Array[String]) {
    val a = List(1,1,2,3,5,8)

    println("last element of list="+a.last)

    println("a's length = "+a.length)

    println("a's reverse="+a.reverse)

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour

    println(oneTwo, threeFour, oneTwoThreeFour)

    val twoThree = List(2, 3)
    // operator :: is right associative operator
    // 1 ;; twoThree is equivalant to twoThree.::(1)
    //
    // prepending with :: takes constant time
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
  }
}
