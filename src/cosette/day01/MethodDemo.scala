package cosette.day01

object MethodDemo {


  //double add(int x, double y) {}
  def add(x: Int, y: Double): Double = {
    x + y
  }

  def add2(x: Int, y: Double)= {
    x + y
  }

  def add3(x: Int, y: Double) {
    x + y
  }

  def add4(x: Int, y: Double): Unit = {
    x + y
  }

  def add5(x: Int, y: Double): Unit = {
    x + y
    () //Unit相当与java中的void
  }

  def main(args: Array[String]): Unit = {

    val r = add(5, 6.6)

    println(r)

    val r2= add2(5,7.5)

    println(r2)

    val r3 = add3(4,5.5)

    println(r3)

    val r4 = add4(4,5.5)

    println(r4)

    val r5 = add5(4,5.5)

    println(r5)



  }
}
