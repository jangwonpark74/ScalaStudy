
object rationalTest {
  def main(args: Array[String]) {

     val a = new Rational(2,3)
     println("a="+  a)
     val b = new Rational(1,6)
     println("b="+ b)

     val c = a + b
     println("a+b=" + c)

     val x = a*b + c
     println("a*b +c=" + x)

     val d = new Rational(10)
     println("d=" + d)
    
     val y = 18 * x

     println(y)
  }
}
