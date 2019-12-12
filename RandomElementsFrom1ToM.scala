

object RandomElementsFrom1ToM {
  def remove[A](n : Int, l : List[A]) : (List[A],A) = {
    (l.take(n):::l.takeRight(l.length-n-1),l(n))
  }
  def randomSelect[A](n: Int, ls: List[A]): List[A] = {
    if (n <= 0) Nil
    else {
      val (rest, e) = remove((new util.Random).nextInt(ls.length), ls)
      e :: randomSelect(n - 1, rest)
    }
  }
  def random1ToM(n : Int,m : Int) : List[Int] = {
    randomSelect(n,List.range(1,m+1))
  }
  def main(args: Array[String]): Unit = {
    print(random1ToM(3, 10))
  }
}