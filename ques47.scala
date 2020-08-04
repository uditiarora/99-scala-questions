package ques
class ques47(a: Boolean) {
  import ques47._
  def not(a: Boolean): Boolean = a match {
    case true  => false
    case false => true
  }
  def and(b: Boolean): Boolean = (a, b) match {
    case (true, true) => true
    case _            => false
  }
  def or(b: Boolean): Boolean = (a, b) match {
    case (true, _) => true
    case (_, true) => true
    case _         => false
  }
  def equ(b: Boolean): Boolean = (a and b) or (not(a) and not(b))
  def xor(b: Boolean): Boolean = not(a equ b)
  def nor(b: Boolean): Boolean = not(a or b)
  def nand(b: Boolean): Boolean = not(a and b)
  def impl(b: Boolean): Boolean = not(a) or b

}

object ques47 {
  implicit def boolean2ques47(a: Boolean): ques47 = new ques47(a)
}
object toRun{
  def not(a: Boolean): Boolean = a match {
    case true  => false
    case false => true
  }
  def main(args: Array[String]): Unit = {
    println("A     B     result")
    for {a <- List(true, false);
         b <- List(true, false)} {
      val ob1 = new ques47(a)
      val ob2 = new ques47(b)
      printf("%-5s %-5s %-5s\n", a, b, ob1 and(ob1 or(not(b)))  )
    }
  }
}