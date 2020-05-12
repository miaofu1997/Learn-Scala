package cosette.day01

object IfDemo {

  def main(args: Array[String]): Unit = {

    var m = -3

//    if(m > 0){
//      println("bigger")
//      println("big")
//    } else
//      println("small")

    if(m < -1) {
      println("A")
    } else if (m > 5) {
      println("B")
    } else {
      println("C")
    }


    val i = if(m > 0) 100 else -1

    println(i)

    val j = if(m > 0) 100 else "abc"

    println(j)


  }
}
