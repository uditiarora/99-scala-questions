

object SplitListIntoTwo {
  def split[A](n : Int,l : List[A]) : (List[A], List[A]) = {
    (l.take(n), l.drop(n))
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,7)
    print(list)
    print("\n")
    print(split(3,list))
  }
}