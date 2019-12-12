

object DropEveryNthElement {
  def drop[A](n: Int, l : List[A]) : List[A] = {
    l.grouped(n).flatMap{_.take(n-1)}.toList
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,5,8);
    print(list)
    print("\n");
    print(drop(2,list));
  }
}