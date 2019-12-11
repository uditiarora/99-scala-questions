

object LengthEncodingOfList {
  def pack[A](l: List[A]):List[List[A]] = {
    def _pack(res: List[List[A]], rem: List[A]):List[List[A]] = rem match {
        case Nil => res
        case ls => {
            val (s: List[A], r: List[A]) = rem span { _ == rem.head }
            _pack(res:::List(s), r)
        }
    }
    _pack(List(), l)
  }
   def encode[A](l: List[A]):List[(Int, A)] = {
    pack(l) map { e => (e.length, e.head) }
  }

   def main(args: Array[String]): Unit = {
    val list = List(1,1,2,3,4,5,6,6);
    print(list);
    print("\n");
    print(encode(list));
  }
}