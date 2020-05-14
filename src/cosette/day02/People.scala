package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 09:31
 * @Description: 主构造器与辅助构造器
 */
class People(val name: String) {

  var age: Int = _ // 不能用val 否则不能赋值
  var gender: String = _

  //辅助构造器，括号内不要用var和val，会报错
  def this(name: String, age: Int){
    //辅助构造器的第一行一定要调用主构造器
    this(name) //this()代表访问当前这个类的主构造器
    this.age = age
  }

  //可以有多个辅助构造器
  def this(name: String, age: Int ,gender: String){
//    this(name)
    //辅助构造器的第一行一定要调用主构造器，或者其他构造器（第一行调了主构造器的）
    this(name, age)
    this.age = age
    this.gender = gender
  }

}

object People{
  def main(args: Array[String]): Unit = {

    val p = new People("Tomcat")
    println(p.name)

    val p1 = new People("Cosie", age = 18)
    println(p1.name)
    println(p1.age)

    val p2 = new People("Cosie", 18, "female")
    println(p2.gender)
  }
}
