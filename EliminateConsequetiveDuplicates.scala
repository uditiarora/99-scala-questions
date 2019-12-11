

object EliminateConsequetiveDuplicates {
  def recurse[A](l :List[A]) : List[A] = l match {
    case Nil =>  Nil
    case h::List() => List(h)
    case h::tail if(h == tail.head) => recurse(tail)
    case h::tail => h::recurse(tail)
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,1,2,3,4,5,6,6);
    print(list);
    print("\n");
    print(recurse(list));
  }
}