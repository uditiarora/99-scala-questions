

object RotateAList {
  def rotate[A](n : Int, l : List[A]) : List[A] = {
    val rn = if (l.isEmpty) 0 else n%l.length
    if(rn<0) rotate(l.length + rn, l)
    else l.drop(rn):::l.take(rn)
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,4,5);
    print(list)
    print("\n")
    print(rotate(5,list))
  }
}