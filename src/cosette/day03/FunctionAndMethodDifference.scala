package cosette.day03

/**
 * cosette.day03
 *
 * @Auther: Cosette
 * @Date: 2020/5/14 15:36
 * @Description:
 */
object FunctionAndMethodDifference {

  def m(x: Int) = {
    println("cosette")
    x * x
  }

  //在函数内部调用一个已经存在的方法
  val f = (a: Int) => {
//    val r = m(a)
//    r
    m(a)
  }

  //定义一个函数
  val ff = (x: Int) => x * x

  //定义一个方法，方法当中可以调函数
  def mm(a: Int) = {
//    val r = ff(a)
//    r
    ff(a)
  }


  def main(args: Array[String]): Unit = {

    var arr = Array(1,2,3,4,5)

    //数组的map方法 要求传入一个函数（输入一个参数返回一个值的函数）
    arr.map(m)

    //等价于
    val f = m _
    arr.map(f)

    //传的并不是方法 而是方法名 “语法糖”让代码更简洁 还是变成了函数
    arr.map(m _)

    //经过测试 将方法转换后生成了新的函数 函数中调用了这个方法
    val func = m _
    val r = func(5)
    println(r)


  }

}
