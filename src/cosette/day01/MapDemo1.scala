package cosette.day01

/**
  * 不可变的Map，长度可内容都不可变，跟用var还是val修饰没关系
  */
object MapDemo1 {

  def main(args: Array[String]): Unit = {

    //定义一个不可变的map
    val m1 = Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5, "f" -> 6)

    //从map中取值
    //val v1 = m1("w")

    val v2 = m1.getOrElse("w", -1)

    println(v2)

    //不可变map的存放的数据内容不可以改变
    //m1("a") = 100

    println(m1)


  }
}
