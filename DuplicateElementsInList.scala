

object DuplicateElementsInList {
  def duplicate[A](l:List[A]):List[A] = {
    l flatMap { e => List(e, e) }
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,1,2,3,4,5,6,6);
    print(list);
    print("\n");
    print(duplicate(list));
  }
}