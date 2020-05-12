package cosette.day01

/**
  * 不可变的List，长度不可变，内容也不可变
  */
object ListDemo1 {

  def main(args: Array[String]): Unit = {

    val lst = List(1, 3, 2, 4, 7, 5, 6, 9)

    //
    //val r: Int = lst(5)
    //println(r)

    //生成一个新的排序的List
    val lst2 = lst.sorted


    //不可变list没法追加
    val lst3 = lst :+ 10
    println(lst3)
    println(lst)
  }
}
