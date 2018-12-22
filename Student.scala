import Array._

object Student {
  def main(args : Array[String]) {
    var sname = Array("John", "Adam", "Rob", "Reena", "Harry")
    var sname1 = Array("Jack", "Jill", "Henry", "Mary", "Rohan")

    var names = concat(sname, sname1)
    println("Student name array elements are : ")

    for( n1 <-names) {
      println(n1)
    }
  }
}
