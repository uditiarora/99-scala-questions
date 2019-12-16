

object Goldbach {
  def isPrime(number: Int): Boolean = {
    if (number == 1) {
        return false;
    }
    if (number % 2 == 0 && number != 2 || number % 3 == 0 && number != 3) {
        return false;
    }
    val limit = ((Math.pow(number, 0.5) + 1) / 6.0 + 1).toInt;
    (1 until limit).foreach(i => {
        if(number % (6 * i - 1) == 0) {
            return false;
        }
        if(number % (6 * i + 1) == 0){
            return false;
        }
    })
    true
}
  def goldbach(primes :List[Int], start : Int, p1 : Int): (Int,Int) =
    primes takeWhile { _ < start } find { p => isPrime(start - p) } match {
      case None     => throw new IllegalArgumentException
      case Some(p1) => (p1, start - p1)
    }
}