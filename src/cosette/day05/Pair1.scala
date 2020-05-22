package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 15:45
 * @Description:
* [T <: Comparable[T]] 上界  upper bound   <T extends Comparable>
* [T >: Comparable[T]] 下界  lower bound   <T super Comparable>
* [T <% Comparable] 视图界定   view bound
* [T : Comparable] 上下文界定 context bound
* [-T] 逆变   方法输入参数
* [+T] 协变   方法返回
 * */

//视图界定，可以实现隐式转换
class Pair1[T <% Comparable[T]] {

  def bigger(first: T, second: T): T = {
    if(first.compareTo(second) > 0) first else second
  }

}

object Pair1 {

  def main(args: Array[String]): Unit = {

    //装的是Scala的Int
    //视图界定：可以隐式转换，将Int 转成 Integer
    //implicit def int2Integer(x: Int) = java.lang.Integer.valueOf(x)
    val pair = new Pair1[Int]

    val r = pair.bigger(5, 3)

    println(r)

  }


}

