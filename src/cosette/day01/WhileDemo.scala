package cosette.day01

object WhileDemo {


  def main(args: Array[String]): Unit = {

    val arr = Array(1, 3, 5, 7, 9)

    var flag = true

    var i: Int = 0

    while (flag) {
      val r = arr(i)
      println(r)
      i += 1
      if(i == arr.size) {
        flag = false
      }
    }


  }


}
