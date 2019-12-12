

object SliceAList {
  def slice[A](i : Int, j : Int, l: List[A]) : List[A]  = {
    l take j drop i
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,4,5);
    print(list)
    print("\n")
    print(slice(2,5,list))
  }
}