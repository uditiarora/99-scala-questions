package ques
import scala.collection.mutable

object ques49 {
  def gray(n: Int): List[String] =
    if (n == 0) List("")
    else {
      val lower = gray(n - 1)
      (lower map { "0" + _ }) ::: (lower.reverse map { "1" + _ })
    }
  

  def main(args: Array[String]): Unit = {
    print(gray(4))
  }

}
