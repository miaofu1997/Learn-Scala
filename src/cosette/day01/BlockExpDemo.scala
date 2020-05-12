package cosette.day01

object BlockExpDemo {

  def main(args: Array[String]): Unit = {

    val x = 0
    //在scala中{}中课包含一系列表达式，块中最后一个表达式的值就是块的值
    //下面就是一个块表达式
    val result: Any = {
      if (x < 0){
       -1
        -10
      } else if(x >= 1) {
        1.0
        100.0
      } else {
        "error"
        "abcd"
      }
    }

    println(result)

  }
}
