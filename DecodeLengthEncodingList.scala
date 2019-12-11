

object DecodeLengthEncodingList {
  def decode[A](l : List[(Int, A)]) : List[A] = {
    def _expand(res: List[A], rem:(Int, A)):List[A] = rem match {
        case (0, _) => res
        case (n, h) => _expand(res:::List(h), (n -1, h))
    }

    l flatMap { e => _expand(List(),e) }
  }
  def main(args: Array[String]): Unit = {
    val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e));
    print(list);
    print("\n");
    print(decode(list));
  }
}