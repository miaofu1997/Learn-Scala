package cosette.day01

import scala.collection.mutable

/**
  * 导入可变集合的set
  * 可变的set，长度和内容都可以改变
  * 不可变的set只能读取数据，不能修改
  */
object SetDemo2 {

  def main(args: Array[String]): Unit = {

    //可变set长度可变，内容可变
    val s1 = mutable.Set(1,2,3,4,5,6,7,8,4,5,6)

    //可以追加元素
    s1 += 10

    //移除一个元素
    s1 -= 4

    println(s1)

    //判断一个算数在s1中是否存在
    val bool = s1.contains(5)
    //val bool = s1(5)
    println(bool)

    //遍历set中的元素
//    for(s <- s1) {
//
//      println(s)
//
//    }

    val s2 = new mutable.HashSet[String]

    s2 += "a"
    s2 += "b"
    s2 ++= Set("d", "a", "f")

    println(s2)

    //LinkedHashSet有序的，按照添加元素的顺序排序
    val ls = new mutable.LinkedHashSet[Int]

    ls += 1
    ls += 2
    ls += 3
    ls += 4
    ls += 3
    println(ls)


    //可排序的set
    val ts = new mutable.TreeSet[Int]()

    ts.add(10)
    ts += 3
    ts += 7
    ts += 2

    println(ts)


    //存入字符串,按照字段顺序排序
    val ts2 = new mutable.TreeSet[String]()

    ts2.add("100")
    ts2 += "15"
    ts2 += "2"
    ts2 ++= Set("22", "20", "5")

    println(ts2)

  }

}
