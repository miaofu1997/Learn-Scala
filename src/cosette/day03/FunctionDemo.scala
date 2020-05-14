package cosette.day03

/**
 * cosette.day03
 *
 * @Auther: Cosette
 * @Date: 2020/5/14 14:05
 * @Description: 函数知识复习
 */
object FunctionDemo {

  def main(args: Array[String]): Unit = {

      //匿名函数
//      (x: Int) => x * x

      //有名字的函数 其实就是用一个变量引用该函数【函数就是一个引用类型，函数就是new的某个类的实例】
      val f = (x: Int) => x * x

      //定义变量可以加类型 也可以不加 scala编译器自己可以推断
      val i = 10
      val j: Int = 10

      //所以定义函数可以加类型 也可以不加
      val f1 = (x: Int, y: Double) => (y ,x) //返回一个整体【元组】
      val f2: (Int, Double) => (Double, Int) = (x: Int, y: Double) => (y, x)
      val f3: (Int, Double) => (Double, Int) = (x, y) => (y, x)

        println("11111")

      //定义List集合、函数ff
      val arr: Array[Int] = Array(1,2,3,4,5,6)
      val ff = (x: Int) => x * x
        println(arr.mkString(","))

      //函数可以作为参数传入到方法中
      val a1 = arr.map(ff)
        println(a1.mkString(","))

      //如果函数只在一个方法中使用一次 那就可以使用匿名函数 scala可以自动推断arr每个元素类型 不用声明输入x类型
      val a2: Array[Int] = arr.map(x => x * x)
        println(a2.mkString(","))

    //下划线表示局部变量 占位符 每次循环取出的每个元素
      val a3 = arr.filter(_ % 2 == 0).map(Math.pow(_, 2))
      println(a3.mkString(","))

    //将方法名传入到方法中





  }

  //定义一个方法，输入int 返回int
  def m(x: Int): Int ={
    x * x
  }

}
