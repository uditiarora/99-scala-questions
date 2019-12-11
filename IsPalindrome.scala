

object IsPalindrome {
  def isPalindrome[A](l : List[A]):Boolean = l match {
    case Nil => true
    case List(a) => true
    case list => (list.head==list.last && isPalindrome(list.tail.init))
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,3,2,1);
    print(isPalindrome(list));
  }
}