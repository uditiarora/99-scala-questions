

object ListInRange {
  def range(s : Int, e : Int): List[Int] = {
    if(s>e)  Nil
    else s :: range(s+1,e)
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,4,5);
    print(list)
    print("\n")
    print(range(2,5))
  }
}