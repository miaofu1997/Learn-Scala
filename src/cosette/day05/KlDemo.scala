package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/21 11:07
 * @Description: 柯里化
 */
object KlDemo {

  //柯里化
  //定义一个方法，可以有多个括号传递参数
  def kl(x: Int)(y: Int): Int = {
    x + y
  }

  def kl2(x: Int)(y: Int, z: Int): Int = {
    x + y + z
  }

  def m(x: Int, y: Int): Int ={
    x + y
  }


  def main(args: Array[String]): Unit = {

    //val r1 = kl(5)(6)

    //val r2 = m(5, 6)

    //println(r1)
    //println(r2)

    val f = kl(8) _

    val f1 = (y: Int) => 8 + y

    println(f)

    val r1 = f(7)
    println(r1)

    val f2 = kl2(8) _

    println(f2)

  }

}
