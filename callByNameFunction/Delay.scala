object Delay {
  def main(args: Array[String]) {
    delayed(time())
  }

  def time() = {
    println("Getting time in nano seconds in time() method")
    System.nanoTime
  }

  def delayed(t: =>Long) = {
    println("In delayed method")
    println("Time : "+t)
  }
}
