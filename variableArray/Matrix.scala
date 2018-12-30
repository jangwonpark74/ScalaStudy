
object Matrix {
  def main(args: Array[String]) {
    val matrix = Array.ofDim[Double](3,4)
    matrix(1)(1) = 1

    for( i <- 0 until 3; j <- 0 until 4) { 
      println("["+i+"]["+j+"]", matrix(i)(j))
    }

  }
}
