package cosette.day01

import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
  * 可变的Map，长度可内容都可变，跟用var还是val修饰没关系
  */
object MapDemo2 {

  def main(args: Array[String]): Unit = {

    //定义一个不可变的map
    val m1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5, "f" -> 6)

    //从map中取值
    //val v1 = m1("w")

    val v2 = m1.getOrElse("w", -1)

    println(v2)

    //可变map的存放的数据内容可以改变
    m1("a") = 100

    m1.put("aaa", 111)

    m1("bbb") = 222

    m1 += "ccc" -> 333

    m1 += (("ddd", 444))

    m1 ++= Map(("www", 999), "zzz" -> 100)

    println(m1)

    //删除元素
    m1 -= "ddd"

    m1.remove("ccc")

    println(m1)



    new mutable.HashMap[String, Int]()
    //按照插入的属性排序
    new mutable.LinkedHashMap[String, Int]
    //按照key的类型的默认顺序进行排序
    new TreeMap[String, Int]

  }
}
