
object ListFilter {
    def main(args: Array[String]) {
        val someNumbers = List(-11, -10, -5, 0, 5, 10)
        println(someNumbers)
        someNumbers.foreach(println _) 

        val filteredNumbers = someNumbers.filter(_ > 0)
        println(filteredNumbers)
        filteredNumbers.foreach(println _)
    }
}
