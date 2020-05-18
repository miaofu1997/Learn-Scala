package cosette.day04.cases

import scala.util.Random

/**
  * scala的模式匹配可以匹配类型
  * 可以匹配基本类型，也可以匹配自定义的类型
  */
object CaseDemo02 extends App{

  //val x = 3
  //val v = if(x >= 5) 1 else if(x < 2) 2.0 else "hello"
  val arr = Array("hello", 1, -2.0, CaseDemo02, 2L)
  val elem = arr(3)

  println(elem)

  elem match {
    case x: Int => println("Int " + x)
    case y: Double if(y >= 0) => println("Double "+ y)
    case z: String => println("String " + z)
    case CaseDemo02 => {
      println("case demo 2")
      //throw new Exception("not match exception")
    }
    case _ => {
      println("default")
    }
  }

}