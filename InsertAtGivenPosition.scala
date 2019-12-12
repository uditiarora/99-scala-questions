

object InsertAtGivenPosition {
  def insert[A](v : A, n : Int, l : List[A]) : List[A] = l.splitAt(n) match{
    case(left,right) => left:::v::right
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,4,5);
    print(list)
    print("\n")
    print(insert(2,5,list))
  }
}