

object CoPrime {
    def gcd(a : Int, b : Int) : Int = {
    if(b==0) {
      a
    }
    
    else if(b>a) {
      gcd(b,a)
    }
    else{
      gcd(b,a%b)
    }
  }
  def isCoprimeTo(m: Int, n: Int): Boolean = gcd(m, n) == 1

  def main(args: Array[String]): Unit = {
    val a = 5;
    val b= 10;
    print(isCoprimeTo(a,b))
    
  }
}