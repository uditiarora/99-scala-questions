

object SortAccordingToLength {
   def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }
   def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) 
   }
   def lsort1[A](ls: List[List[A]]): List[List[A]] =
    ls sortWith { _.length < _.length }

  def lsort2[A](ls: List[List[A]]): List[List[A]] =
    ls.sortBy(_.length)

  def lsortFreq1[A](ls: List[List[A]]): List[List[A]] = {
    val freqs = Map(encode(ls map(_.length) sorted) map(_.swap): _*)
    ls sortBy(x => freqs(x.length))
  }

  def lsortFreq2[A](ls: List[List[A]]): List[List[A]] = 
    ls.groupBy(_.length).toList.map(_._2).sortBy(_.length).flatten


  def main(args: Array[String]): Unit = {
    val list = List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))
    print(lsortFreq1(list))
  }
}