package cosette.day01

/**
  * immutable.Set
  * sacal中导入的set是不可以的Set，set中的内容和长度都不可以改变
  * 不可变的set只能读取数据，不能修改
  */
object SetDemo1 {

  def main(args: Array[String]): Unit = {

    //无序去重
    val s1 = Set(1,2,3,4,5,6,7,8,4,5,6)

    //不可以改变内容
    //s1 += 10
    println(s1)

    //判断一个算数在s1中是否存在
    //val bool = s1.contains(5)
    //val bool = s1(5)
    //println(bool)

    //遍历set中的元素
    for(s <- s1) {

      println(s)

    }


  }

}
