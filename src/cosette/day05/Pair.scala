package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 15:28
 * [T <: Comparable[T]] 上界  upper bound   <T extends Comparable>
 * [T >: Comparable[T]] 下界  lower bound   <T super Comparable>
 * [T <% Comparable] 视图界定   view bound
 * [T : Comparable] 上下文界定 context bound
 * [-T] 逆变   方法输入参数
 * [+T] 协变   方法返回
 *
 */
class Pair[T <: Comparable[T]] {

  //T实现了Comparable接口
  def bigger(first: T, second: T): T = {
    if(first.compareTo(second) > 0) first else second
  }

}

object Pair {
  def main(args: Array[String]): Unit = {

    //装的是Scala的Int, 没有实现Comparable接口
    //val pair = new Pair[Int]

    //Java的Integer则实现了Comparable接口
    val pair = new Pair[Integer]
    val r = pair.bigger(5, 10)
    println(r)

    //Java的String也实现了Comparable接口
    val pair2 = new Pair[String]
    val r2 = pair2.bigger("jerry","tom")
    println(r2)

  }
}
