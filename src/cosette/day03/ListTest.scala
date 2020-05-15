package cosette.day03

/**
 * cosette.day03
 *
 * @Auther: Cosette
 * @Date: 2020/5/15 10:04
 * @Description:
 */
object ListTest {

  def main(args: Array[String]): Unit = {

    var arr = Array(1,7,3,6,2,8,5,4,9)

    val max = arr.max
    println(max)

    val min = arr.min
    println(min)

    val sum = arr.sum
    println(sum)

    println(sum.toDouble / arr.length)

    // 1 + 7 = 8
    // 8 + 3 = 11
    // ...
    val r1 = arr.reduce((x, y) => x + y)
    println(r1)
    val r2 = arr.reduceLeft((x, y) => x + y) //等价于reduce
    println(r2)
    val r3 = arr.reduce(_+_) //第一个_是x 第二个_是y
    println(r3)

    val r4 = arr.fold(100)(_+_) //和reduce的区别 可以加初始值 再传函数
    println(r4)
    val r5 = arr.foldLeft(100)(_+_) //和reduce的区别 可以加初始值
    println(r5)

    val r6 = arr.foldRight(100)(_+_) //和reduce的区别 可以加初始值
    println(r6)



  }
}
