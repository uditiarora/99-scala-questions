

object LengthOfList {
  def length[A](l: List[A]):Int = l match{
    case Nil => 0;
    case h::tail => 1 + length(tail);
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6);
    print(length(list));
  }
}