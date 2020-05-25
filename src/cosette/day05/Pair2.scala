package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 16:56
 * @Description: 视图界定就是为了实现隐式转换的，视图界定需要传入一个隐式转换方法或函数，优先使用函数
 * 在Scala中有两个特质 Ordered、Ordering，这两个特质专门是用来比较的
 * Ordered 实现了 Comparable接口，Ordered对Comparable接口进行可扩展
 * Ordering 实现了 Comparator接口，Ordering对Comparator接口进行了扩展
 * 目的就是为了进行比较时，更加的方便
 */
class Pair2[T <% Ordered[T]] {

  def bigger(first: T, second: T): T = {
    //first可以用>=方法 是把T变成了Ordered[T] 用了Ordered里面的<=方法
    if(first >= second) first else second
  }

}

object Pair2 {
  def main(args: Array[String]): Unit = {

    val p1 = new Pair2[Int]

    //能比较大小 说明在Predef中有个隐式转换将Int转变成了Ordering[Int] 有比较器Comparator 但在这里用的Ordered[T]
    //在Ordered源码最后 又有个隐式转换方法 将Ordering[Int]再转成Ordered[Int]
    val r1 = p1.bigger(5, 8)
    println(r1)

    import MyPredef.boy2OrderedBoy //导入隐式转换

    val p = new Pair2[Boy] //自己定义的类
    //现在可以比了 因为隐式转换在MyPredef里让Boy转成了Ordered[Boy] 而Ordered继承了Comparable接口
    val r = p.bigger(new Boy("老赵", 9999.9), new Boy("老段", 999.9))
    println(r)

  }
}