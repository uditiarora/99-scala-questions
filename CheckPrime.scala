

object CheckPrime {
  def isPrime(x : Int) : Boolean = {
    (x>1) && !((2 until x-1) exists (x % _ ==0))
  }
  def main(args: Array[String]): Unit = {
    val x = 7
    print(isPrime(x))
  }
}