class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def subtract(r: Rational) = new Rational(numer * r.denom - r.numer * denom, denom * r.denom)
}

object question_10_1 extends App {
  val r1 = new Rational(4, 5)
  val r2 = new Rational(3, 10)
  println(s"Rational 1: $r1")
  println(s"Rational 2: $r2")
  
  val result = r1.subtract(r2)
  println(s"Subtraction Result: $result")
}
