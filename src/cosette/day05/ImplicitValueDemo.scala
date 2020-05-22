package cosette.day05

import scala.runtime.RichInt

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 09:55
 * @Description:
 */
object ImplicitValueDemo {

//  implicit val abc = 666

  def m1(x: Int): Int = {
    x * x
  }

  //普通的方法，传递普通的参数，可以使用默认值，不用定义成implicit参数
  def m2(x: Int = 8): Int = {
    x * x
  }

  def m3(implicit x: Int = 8): Int = {
    x * x
  }

  //柯里化方法，y有默认值，【普通】的默认值不能使用
  def kl1(x: Int)(y: Int = 8): Int = {
    x + y
  }

  //柯里化方法结合隐式值
  def kl2(x: Int)(implicit y: Int = 8): Int = {
    x + y
  }

  def main(args: Array[String]): Unit = {
//    val r1 = m1(8)
//    println(r1)

//    //方法中的参数有默认值 可以不传参
//    val r2 = m2()
//    println(r2)
//
//    //外部传了值会优先使用
//    val r3 = m2(10)
//    println(r3)

    //导入隐式参数
    //import MyContext._

    //如果是类，先要new实例，然后再导入隐式值
    val mc = new MyContext2
    import mc.abcdef

    val r4 = kl2(20)
    println(r4)

//    val r5 = m3()
//    println(r5)

    //Int 转成了 RichInt
    //隐式转换，扩展了功能，功能更多，调用更方便
    1 to 20

    //没有使用隐式转换，使用隐式转换更加方便
    new RichInt(1).to(10)

  }
}
