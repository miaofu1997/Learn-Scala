package cosette.day01

import scala.collection.mutable.ListBuffer

/**
  * 不可变的List，长度不可变，内容也不可变
  */
object ListDemo2 {

  def main(args: Array[String]): Unit = {


    val lb = new ListBuffer[Int]

    lb += 5
    lb ++= List(7,1,2,3,4, 5)
    lb -= 5

    println(lb)

  }
}
