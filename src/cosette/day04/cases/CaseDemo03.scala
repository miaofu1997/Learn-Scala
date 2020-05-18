package cosette.day04.cases

/**
  * Created by ZhaoXing on 2016/6/27.
  */
object CaseDemo03 extends App{

//  //scala的模式匹配可以匹配数组【值和长度】
//  val arr = Array(2, 4, 7, 0)
//  arr match {
//    case Array(1, 3, x, y) => println(s"x: $x, y: $y")
//    case Array(1, 2, 7, y) => println(s"only 0 y: $y" )
//    case Array(1, _*) => println("0 ...")
//    case _ => println("something else")
//  }


////  scala模式匹配可以匹配List
//  val lst = List(0, 5, 6)
//  println(lst.head)
//  println(lst.tail)
//  lst match {
//      // ::也表示拼接， 生成新list
//    case 0 :: Nil => println("only 0") //一个元素
//    case x :: y :: Nil => println(s"x $x y $y") //两个元素
//    case 0 :: a => println(s"0 ... $a") //以0开头 多个元素
//    case _ => println("something else")
//  }

  //scala模式匹配可以匹配元组
  val tup = (2, 3, 5)
  tup match {
    case (1, x, y) => println(s"hello 123 $x , $y")
    case (_, z, 5) => println(z)
    case  _ => println("else")
  }

  val lst1 = 9 :: (5 :: (2 :: Nil))
  val lst2 = 9 :: 5 :: 2 :: List()
  println(lst2)
}
