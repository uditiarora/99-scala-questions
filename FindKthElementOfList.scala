

object FindKthElementOfList {
  def findKth[A](k:Int, l:List[A]):A = (k,l) match {
    case (0, h::_) => h
    case (k, _::tail) if k > 0 => findKth(k - 1, tail)
    case _ => throw new NoSuchElementException
}
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6);
    println(findKth(2,list));

  }
}