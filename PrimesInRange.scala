

object PrimesInRange {
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
  def listPrimesinRange(l: Int, r: Int): Unit ={
    
    (l to r).foreach(i => (if (isPrime(i) == true) println(i)))
  }
  def main(args: Array[String]): Unit = {
    val l = 10;
    val r = 20;
    listPrimesinRange(l, r)
  }
}