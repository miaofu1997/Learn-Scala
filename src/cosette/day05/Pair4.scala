package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/25 16:03
 * @Description: 柯里化结合隐式参数，实现隐式转换
 */

import MyPredef._ //很多地方用到隐式转换 直接在最上面导入全部

class Pair4[T] {

  /**
   * 柯里化结合隐式参数，需要传入一个隐式转换函数，实现隐式转换
   * 这种方式和[视图界定]的效果是一样的
   */
  def choose(first: T, second: T)(implicit ord: T => Ordered[T]): T = {
    if(first >= second) first else second
  }

  /**
   * 柯里化结合隐式参数，需要传入一个隐式的object，实现隐式转换
   * 这种方式和[上下文界定]的效果是一样的
   */
  def select(first: T, second: T)(implicit ord: Ordering[T]): T = {
    if(ord.gteq(first, second)) first else second
  }

}

object Pair4 {
  def main(args: Array[String]): Unit = {

//    import MyPredef.boy2OrderedBoy
    val p1 = new Pair4[Boy]
    val r1 = p1.choose(new Boy("laozhao", 9999.99), new Boy("laoduan", 999.99))
    println(r1)

//    import MyPredef.OrderingMan
    val p2 = new Pair4[Man]
    val r2 = p2.select(new Man("laozhao", 18), new Man("laodaun", 33))
    println(r2)

  }
}