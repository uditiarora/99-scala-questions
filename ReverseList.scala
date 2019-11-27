

object ReverseList {
  def reverse[A](l: List[A]): List[A] = l match {
    case h :: tail => reverse(tail) ::: List(h)
    case Nil => Nil
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6);
    print(reverse(list));
  }
}