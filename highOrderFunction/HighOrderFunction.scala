
object HighOrderFunction {
  def main(args: Array[String]) {
    
    /** 
     * case #1 
     */

    println( apply( layout, 10 ) )

    /**
     * case #2
     */
    val doubleSalary = (x: Int) => x*2
    val init_salaries = Seq(20000, 70000, 40000)
    val salaries = init_salaries.map(doubleSalary)

    println( salaries) 

  }

  def apply(f : Int => String, v : Int) = f(v)

  def layout[A](x:A) = "[" + x.toString() + "]"
}



