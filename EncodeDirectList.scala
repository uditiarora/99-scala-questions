

object EncodeDirectList {
  def encodeDirect[A](l: List[A]):List[(Int, A)] = {
    def _encodeDirect(res: List[(Int, A)], rem: List[A]):List[(Int, A)] = rem match {
        case Nil => res
        case ls => {
            val (s, r) = rem span { _ == rem.head }
            _encodeDirect(res:::List((s.length, s.head)), r)
        }
    }
    _encodeDirect(List(), l)
} 
   def main(args: Array[String]): Unit = {
    val list = List(1,1,2,3,4,5,6,6);
    print(list);
    print("\n");
    print(encodeDirect(list));
  }
}