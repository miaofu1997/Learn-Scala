package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 15:12
 * @Description:
 */
object ApplyDemo {

  //静态对象可以有多个apply方法 但参数不能相同 即apply方法可以重载
  def apply() = {
    println("888")
  }
  def apply(x: Int) = {
    println(x)
  }
  def apply(x: Int, y: Double) = {
    println(x+y)
  }


  def main(args: Array[String]): Unit = {
    ApplyDemo()
    ApplyDemo.apply()
    //以上二者等价，Scala只允许apply方法不写".apply()"
    //直接"静态对象名(参数)"就调用对应对象的apply方法

    ApplyDemo(666)

    ApplyDemo(2,9.5)

    val arr1 = Array(1,2,3,4,5) //Array是对象 这里就用了apply方法省略
    val arr2 = Array.apply(1,2,3,4,5) //二者等价
  }
}
