

object PackConsequetiveDuplicates {
 def packInner[T](acc: List[T], l: List[T]): List[List[T]] = l match {
      case e :: tail if acc.isEmpty => packInner(List(e), tail)
      case e :: tail if e == acc.head => packInner(e :: acc, tail)
      case e :: tail if e != acc.head => acc :: packInner(List(e), tail)
      case Nil => List(acc)
    }
   
  def main(args: Array[String]): Unit = {
    val list = List(1,1,2,3,4,5,6,6);
    print(list);
    print("\n");
    print(packInner(List(),List(list)));
  }
}