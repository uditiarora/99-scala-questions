

object GroupElements {
  def combinations[A](k : Int, l : List[A]):List[List[A]] = l match{
    case Nil => Nil
    case h :: tail => 
      if(k==0 || k> l.length)  Nil
      else if(k==1) l.map(List(_))
      else combinations(k-1, tail).map(h :: _) ::: combinations(k, tail)
  }
   def group[A](ns: List[Int], ls: List[A]): List[List[List[A]]] = ns match {
    case Nil     => List(Nil)
    case n :: ns => combinations(n, ls) flatMap { c =>
      group(ns, ls diff c ) map {c :: _}
    }
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,23,4,4,5,6);
    val ns = List(3,3,1);
    group(ns,list).foreach(println);
  }
}