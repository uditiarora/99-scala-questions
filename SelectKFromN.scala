

object SelectKFromN {
  def combinations[A](k : Int, l : List[A]):List[List[A]] = l match{
    case Nil => Nil
    case h :: tail => 
      if(k==0 || k> l.length)  Nil
      else if(k==1) l.map(List(_))
      else combinations(k-1, tail).map(h :: _) ::: combinations(k, tail)
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,3,3,4,5,8);
    print(list);
    print("\n");
    print(combinations(3, list))
  }
}