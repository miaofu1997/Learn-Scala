package cosette.day05

import cosette.day03.advlist.MyFunction2

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 15:20
 * @Description:
 */

trait MyFunction2[-A, -B, +C] {
  def apply(a: A, b: B): C
}

object TestMyFunction {

  def main(args: Array[String]): Unit = {

    val func = new MyFunction2[Int, Double, (Double, Int)] {
      override def apply(a: Int, b: Double): (Double, Int) = {
        (b, a)
      }
    }

    val tp = func.apply(5, 7.7)
    println(tp)

  }
}