package cosette.day04.cases

object PartialFuncDemo  {

  /**
    * 偏函数，类型是PartialFunction，有case，没有match
    * 作用：就是做模式匹配的
    * @return
    */
  def pm: PartialFunction[String, Int] = {
    //特点：有case没有match
    case "one" => {
      println("one case")
      1
    }
    case "two" => 2
    case _ => -1
  }

  def pm2: PartialFunction[String, Unit] = {
    //有输入 没返回 执行逻辑
    case "one" => {
      println("11111")
    }
    case "two" => {
      println("222222")
    }
    case _ =>  {
      println("0000")
    }
  }

  //不用偏函数 用match case也可以实现
  def func2(num: String) : Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }


  def main(args: Array[String]) {

    println(pm("one"))

    println(pm2("one")) //方法返回的是unit 打印空括号

    println(func2("two"))

  }
}
