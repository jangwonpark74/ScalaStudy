
class Movie(val name:String, val year: Short)

object Movie {
  def academyAwardBestMoviesForYear(x: Short) = {
    x match {
      case 1930 => Some(new Movie("All Quiet On the Western Front", 1930))
      case 1931 => Some(new Movie("Cimarron", 1931))
      case 1932 => Some(new Movie("Grand Hotel", 1932))
      case _ => None
    }
  }

  def main(args: Array[String]) {
    println( Movie.academyAwardBestMoviesForYear(1932).get.name )
  }
}


