package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/12 17:02
 * @Description:
 */
class Person {

  var name = "Tomcat"

  def getNation() = {
    println(Person.nation)
  }
  def getPassword() = {
    //拿不到了
//    println(Person.password)
  }
}

object Person{

  //静态变量，所有类的实例共享的
  private val nation: String = "中国"
  private[this] var password: String = _

  def printPassword() = {
        println(password)
  }

  def main(args: Array[String]): Unit = {

    val p1 = new Person
    println(p1.name)
    val p2 = new Person

    //访问静态变量
    println(Person.nation)

    val n = p1.getNation()


  }
}
