

object DuplicateNTimes {
  def duplicateN[A](n: Int, l: List[A]):List[A] = {
    l flatMap { e => List.fill(n)(e) }
  }
  
  def main(args: Array[String]): Unit = {
    val list = List(1,1,2,3,4,5,6,6);
    print(list);
    print("\n");
    print(duplicateN(3, list));
  }
}