package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 16:56
 * @Description: 视图界定就是为了实现隐式转换的，视图界定需要传入一个隐式转换方法或函数，优先使用函数
 * 在Scala中有两个特质 Ordered、Ordering
 * 这两个特质专门是用来比较的
 * Ordered 实现了 Comparable接口，Ordered对Comparable接口进行可扩展
 * Ordering 实现了 Comparator接口， Ordering对Comparator接口进行了扩展
 * 目的就是为了进行比较时，更加的方便
 */
class Pair2[T <% Ordered[T]] {

  def bigger(first: T, second: T): T = {
    if(first >= second) first else second
  }

}

object Pair2 {
  def main(args: Array[String]): Unit = {

//    val p = new Pair2[Int]
//
//    val r = p.bigger(5, 8)
//    println(r)

    import MyPredef.boy2OrderedBoy

    val p = new Pair2[Boy]
    val r = p.bigger(new Boy("老赵", 9999.9), new Boy("老段", 999.9))
    println(r)



  }
}