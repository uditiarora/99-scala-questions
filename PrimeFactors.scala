

object PrimeFactors {
  
   def isPrime(x : Int) : Boolean = {
    (x>1) && !((2 until x-1) exists (x % _ ==0))
    
  }
   def listPrimes(x: Int): List[Int] = {
     var list = List[Int]()
     for(i <- 2 to x){
       if(isPrime(i) && x%i == 0){
         list = list ::: List(i)
       }
     }
     list
   }
   def main(args: Array[String]): Unit = {
     val a = 10;
     print(listPrimes(a))
   }
}