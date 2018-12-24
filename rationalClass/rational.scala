
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val num: Int = n/g
  val denom: Int = d/g
 
  // override toString method
  override def toString = if(denom == 1) ""+ num else num +"/" + denom 

  // Auxiliary Constructor
  def this(n: Int) = this(n, 1)

  implicit def intToRational(x: Int) = new Rational(x)

  def + (that: Rational): Rational = 
    new Rational( num*that.denom
      + that.num*denom, denom*that.denom)

  def + (i: Int): Rational = 
    new Rational( num + i*denom, denom)

  def - (that: Rational): Rational =
    new Rational (
      num * that.denom - that.num * denom,
      denom * that.denom
    )

  def - (i: Int): Rational = 
    new Rational(num - i*denom, denom) 

  def * (that: Rational): Rational = 
    new Rational(num*that.num, denom*that.denom)

  def * (i: Int): Rational = 
    new Rational(num * i, denom)

  def / (that: Rational): Rational =
    new Rational(num * that.denom, denom * that.num)

  def / (i: Int): Rational = 
    new Rational(num, denom *i)

  private def gcd(a: Int, b: Int): Int = 
    if(b == 0) a else gcd(b, a % b)

}

