

object RemoveElementAndReturnTuple {
  def remove[A](n : Int, l : List[A]) : (List[A],A) = {
    (l.take(n):::l.takeRight(l.length-n-1),l(n))
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,4,5);
    print(list)
    print("\n")
    print(remove(5,list))
  }
}