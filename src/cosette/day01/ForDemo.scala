package cosette.day01

object ForDemo {

  //static的方法
  def main(args: Array[String]): Unit = {

    val str = "ABCDEFG"

    //    for (s <- str) {
    //      println(s)
    //    }

    //取出字符串对应脚本的字符
    //val c = str(3)
    //println(c)

    //    for(i <- 0 to 6) {
    //      println(str(i))
    //    }


    //0 to 7 代表[0,7]的有序区间
    //println(str.length)
    //str.length - 1不太好
    //        for(i <- 0 to str.length - 1) {
    //          println(str(i))
    //        }

    //    for (i <- 0 until str.length) {
    //      println(str(i))
    //    }


    val arr = Array(1, 3, 5, 7, 9)

    //    for(i <- arr) println(i)
    //
    //    for(i <- arr) {
    //
    //      println(i)
    //
    //    }

//    for(i <- 0 until arr.size) {
//      println(arr(i))
//    }


    for(i <- 1 to 3; j <- 1 to 3 if i != j)
      print((10 * i + j) + " ")
    println()






  }
}
