package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 11:22
 * @Description: 单例对象
 *              Scala中用小写的object代表一个静态对象，也是单例对象。满足一定条件就是伴生对象。
 *              单例对象指它在整个进程中只有一个实例对象，不用加private，不用再定义一个类。
 */
object ScalaObj {
  def main(args: Array[String]): Unit = {

    //没有new，new的一定是类，而这是对象。
    val s1 = ScalaObj
    println(s1)

    //s1和s2在一个java进程当中只有一份，指向相同的地址，就是一个单例。
    val s2 = ScalaObj
    println(s2)

  }
}
