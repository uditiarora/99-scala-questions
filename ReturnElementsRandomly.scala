

object ReturnElementsRandomly {
  def remove[A](n : Int, l : List[A]) : (List[A],A) = {
    (l.take(n):::l.takeRight(l.length-n),l(n))
  }
  def randomSelect[A](n: Int, ls: List[A]): List[A] = {
    if (n <= 0) Nil
    else {
      val (rest, e) = remove((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect(n - 1, rest)
    }
  }
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,4,5);
    print(list)
    print("\n")
    print(randomSelect(2,list))
  }
}