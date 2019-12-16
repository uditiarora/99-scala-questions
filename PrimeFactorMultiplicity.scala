

object PrimeFactorMultiplicity {
  

  
   def isPrime(x : Int) : Boolean = {
    (x>1) && !((2 until x-1) exists (x % _ ==0))
    
  }
   def listPrimes(x: Int): scala.collection.mutable.Map[Int,Int] = {
     val map = scala.collection.mutable.Map[Int,Int]()
     var a = x;
     for(i <- 2 to x){
       if(isPrime(i) && x%i == 0){
         var count = 0;
         while(a%i ==0){
           a = a/i;
           count += 1;
         }
         map(i) = count
       }
     }
     map
   }
   def main(args: Array[String]): Unit = {
     val a = 10;
     print(listPrimes(a))
   }

}