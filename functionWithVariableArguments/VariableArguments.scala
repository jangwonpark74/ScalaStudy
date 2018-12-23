
object VariableArguments {
  def main(args : Array[String]) {
    printStrings("Hello", "Scala")
    printStrings("Hello", "Scala", "Go")
  }

  def printStrings(args:String*) = {

    println("print in method printStrings()")
    
    var i : Int = 0
    for (arg <-args) {
      println("Arg value[" + i + "] = " + arg)
      i = i + 1 
    }
  }
}
