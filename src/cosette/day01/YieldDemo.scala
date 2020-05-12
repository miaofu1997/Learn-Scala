package cosette.day01

object YieldDemo {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,4,5,6,7,8)

    val nArr = for(i <- arr) yield i * 10

    println(nArr.toBuffer)

    1.+(6)


  }
}
