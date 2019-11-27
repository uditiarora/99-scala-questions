

object LastButElementOfList {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6);
    if(list.size<=1){
      println("Invalid");
    }
    else{
      println(list(list.size-2));
    }
  }
}