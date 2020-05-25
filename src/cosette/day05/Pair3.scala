package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/25 14:54
 * @Description:
 * 上下文界定，也是为了实现Scala的隐式转换的
 * 上下文界定，需要传入一个隐式的object
 */
class Pair3[T : Ordering] {

  def bigger(first: T, second: T): T = {
    //implicitly关键字 将Ordering跟T关联在一起
    val ord = implicitly[Ordering[T]]
    if(ord.gt(first, second)) first else second
  }

}

object Pair3 {
  def main(args: Array[String]): Unit = {

    import MyPredef.OrderingMan //要在new之前导进来
    val p = new Pair3[Man]
    val r = p.bigger(new Man("赵", 18), new Man("段", 33))
    println(r)

  }
}