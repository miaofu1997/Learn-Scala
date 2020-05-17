package cosette.day03

/**
 * cosette.day03
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 19:22
 * @Description:
 */
object FunctionInDepth {

  val f2: (Int, Double) => Double = (x, y) => x + y
//  val f2: Function2[Int, Double, Double] = (x, y) => x + y

  val ff = new Function2[Int, Double, (Double, Int)] {
    override def apply(v1: Int, v2: Double): (Double, Int) = {
      (v2, v1)
    }
  }

 //推荐使用,用语法糖写得更简洁
  val ff2 = (x: Int, y: Double) => (y, x)

  def main(args: Array[String]): Unit = {

    val tuple = ff(5, 7.7)
    val tuple2 = ff.apply(5,7.7)
    val tuple3 = ff2.apply(5, 7.7)
    println(tuple3)

  }

}
