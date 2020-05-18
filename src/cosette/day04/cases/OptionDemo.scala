package cosette.day04.cases

/**
  * 在Scala中，从Map中取KEY对应的Value，返回的是一个Option，根据key有可能取得对应的value，也可能取不到
  * 取得了就是Some(v)，Some中包装了对应的值，Some是多实例的，所以Some 是一个case class
  * 没取到就是None，None不用封装数据，None是单例的，不用封装数据,是一个 case object
  * Some和None都继承继承了Option
  * sealed 代表子类一定是case class或case object，就是用来做模式匹配的
  */
object OptionDemo {
  def main(args: Array[String]) {

    val m = Map("a" -> 1, "b" -> 2)

    //val i: Int = m("c")
    //println(i)

    val o: Option[Int] = m.get("f") //返回Option类，两个子类：None或者Some

    //进行模式匹配
    val r: Any = o match {
      //没有取到对应的Value
      case None => {
        null
      }
      //取到了对应的Value
      case Some(i) => {
        i
      }
    }

    println(r)

    //更简洁的方式
    val r1 = m.getOrElse("a", -1)
    println(r1)

  }
}
