package cosette.day04.cases

import scala.util.Random

/**
  *
  * case class 可以不用new ，主要用于模式匹配，已经实现了序列化接口。多实例，每个实例都可以保存自己的实例，有状态的
  *
  * case object 主要用于模式匹配，已经实现了序列化接口。单例的，没状态的
  */

//case class主要是为了封装数据和模式匹配,scala中的case class和case object是编译器本身优化的，效率更高，比if判断效率更高
case class SubmitTask(id: String, name: String) //里面是可以写方法的

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo04 extends App{

  val arr = Array(CheckTimeOutTask, new HeartBeat(123), HeartBeat(88888), new HeartBeat(666), SubmitTask("0001", "task-0001"))

  val a = arr(4)

  println(a)

  a match {
    case SubmitTask(i, n) => {
      println(s"$i, $n")
      println("haha")
    }
    case HeartBeat(time) => {
      println(time)
    }
    case CheckTimeOutTask => {
      println("check")
    }
  }
}
