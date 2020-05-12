package cosette.day01

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {

  def main(args: Array[String]): Unit = {


    val ab = new ArrayBuffer[Int]()
    //+=是在原来的基础之上进行追加
    ab += 5
    ab += 7
    ab += 8
    ab += 5


    //-=是从左开始删除第一个出现的元素
    ab -= 5

    //改变ArrayBuffer中元素的值
    ab(1) = 80

    //从指定的位置前面插入元素
//    ab.insert(1, 9, 10)

    //从指定位置[包括指定的位置]删除多个元素
    ab.remove(1, 3)

    println(ab)

    val r = ab.sum

    println(r)
  }
}
