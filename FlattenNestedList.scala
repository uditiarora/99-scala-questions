

object FlattenNestedList {
  def flatten(l :List[Any]) : List[Any] = l match {
    case Nil =>  Nil
    case (h: List[Any]) :: tail => flatten(h):::flatten(tail)
    case h :: tail => h :: flatten(tail)
  }
  def main(args: Array[String]): Unit = {
    val list = List(List(1,2),3,List(4,5,6));
    print(list);
    print("\n");
    print(flatten(list));
  }
}