package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/12 14:53
 * @Description: 元组：元素的组合，长度内容不可变，角标从1开始 tp._1
 */
object TupleDemo {

  def m(x: Int, y: Double) ={
    val x1 = x * 10
    val y1 = y * 100
    val w1 = "hello"
    (x1, y1, w1)
  }

  def main(args: Array[String]): Unit = {

    val tp: (Int, Double, String) = m(1,2.0)

    val s1 = tp._3

    val d: Double = tp._2

    println(d)

  }

}
