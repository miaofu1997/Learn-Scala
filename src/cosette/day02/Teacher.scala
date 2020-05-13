package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 09:18
 * @Description: Scala中的构造器非常简单 跟类名交织在一起的叫主构造器
 *
 *
 */
class Teacher(val name: String,
              var age: Int,
              var fv: Double,
              private var account: String = "6220027",
              private[this] var password: String = "123456") {

  private def getPassword(): String ={
    password
  }

}

object Teacher{
  def main(args: Array[String]): Unit = {

    val t = new Teacher("Cosie",23, 99.99)

//    t.name = "Freya" // val修饰的只有getter没有setter
    println(t.name)
    println(t.age)
    println(t.fv)
    println(t.account)
    println(t.getPassword())

  }
}