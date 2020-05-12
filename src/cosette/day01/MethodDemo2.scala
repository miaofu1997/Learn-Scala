package cosette.day01

/**
  * 定义在object中的方法是静态方法
  */
object MethodDemo2 {

  def main(args: Array[String]): Unit = {

//    MethodDemo2.abc()
//    abc()
//    abc
//
//    erg

    val r = addMutly(3, 4, 5)
    println(r)
  }




  def abc(): Unit ={
    println("hello world")
  }

  def erg : Unit = {
    println("asdf")
  }

  //addM(int x, int y ...)
  def addMutly(x: Int, y: Int*) = {
    x + y.sum
  }



}
