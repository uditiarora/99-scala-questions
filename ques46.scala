
package ques

object ques46 {
  def not(a: Boolean): Boolean = a match {
    case true => false
    case false => true
  }
  def and(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, true) => true
    case _            => false
  }
  def or(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, _) => true
    case (_, true) => true
    case _         => false
  }
  def equ(a: Boolean, b: Boolean): Boolean = or(and(a, b), and(not(a), not(b)))
  def xor(a: Boolean, b: Boolean): Boolean = not(equ(a, b))
  def nor(a: Boolean, b: Boolean): Boolean = not(or(a, b))
  def nand(a: Boolean, b: Boolean): Boolean = not(and(a, b))
  def impl(a: Boolean, b: Boolean): Boolean = or(not(a), b)



  def main(args: Array[String]): Unit = {
    println("A     B     result")
    for {a <- List(true, false);
         b <- List(true, false)} {
      printf("%-5s %-5s %-5s\n", a, b, and(a, b))
    }
  }

}
