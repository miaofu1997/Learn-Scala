package cosette.day03

/**
 * cosette.day03
 *
 * @Auther: Cosette
 * @Date: 2020/5/14 17:19
 * @Description:
 */
object MethodDemo {

  def m(f: Int => String, x: Int): Unit = {
    val res = f(x)
    println(res)
  }

  //f: (Int, Double) => Double是函数定义
  def m2(f: (Int, Double) => Double, a: Int, b: Double ) = {
    val r = f(a, b) //调用函数
    println(r)
  }


  def main(args: Array[String]): Unit = {

    //调用一个自己定义的方法，这个方法可以接收一个函数
    m(x => x.toString + "Cosie", 888)

    m2((x, y) => x * y, 5, 6.6)

  }
}
