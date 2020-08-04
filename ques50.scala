package ques

object ques50 {
  private abstract sealed class Tree[A] {
    val freq: Int
    def toCode: List[(A, String)] = toCodePrefixed("")
    def toCodePrefixed(prefix: String): List[(A, String)]
  }
  private final case class InternalNode[A](left: Tree[A], right: Tree[A]) extends Tree[A] {
    val freq: Int = left.freq + right.freq
    def toCodePrefixed(prefix: String): List[(A, String)] =
      left.toCodePrefixed(prefix + "0") ::: right.toCodePrefixed(prefix + "1")
  }
  private final case class LeafNode[A](element: A, freq: Int) extends Tree[A] {
    def toCodePrefixed(prefix: String): List[(A, String)] = List((element, prefix))
  }

  def huffman[A](ls: List[(A, Int)]): List[(A, String)] = {
    import collection.immutable.Queue
    def dequeueSmallest(q1: Queue[Tree[A]], q2: Queue[Tree[A]]) = {

      if (q2.isEmpty) (q1.front, q1.dequeue._2, q2)
      else if (q1.isEmpty || q2.front.freq < q1.front.freq) (q2.front, q1, q2.dequeue._2)
      else (q1.front, q1.dequeue._2, q2)
    }
    def huffmanR(q1: Queue[Tree[A]], q2: Queue[Tree[A]]): List[(A, String)] = {
      if (q1.length + q2.length == 1) (if (q1.isEmpty) q2.front else q1.front).toCode
      else {
        val (v1, q3, q4) = dequeueSmallest(q1, q2)
        val (v2, q5, q6) = dequeueSmallest(q3, q4)
        huffmanR(q5, q6.enqueue(InternalNode(v1, v2)))
      }
    }
    
    huffmanR(Queue.Empty.enqueue(ls sort { _._2 < _._2 } map { e => LeafNode(e._1, e._2) }),
      Queue.Empty)
  }

  def main(args: Array[String]): Unit = {
    huffman(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5)))
  }
}
