

object GCD {
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
  def main(args: Array[String]): Unit = {
    val a = 5;
    val b= 10;
    print(gcd(a,b))
    
  }
}