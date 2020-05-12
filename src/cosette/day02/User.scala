package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/12 16:30
 * @Description:
 */
class User {

  var name = "Tom"

  //pet和printPet()是私有的成员变量/方法 不能用u.pet访问了 但在类内部和伴生对象可以
  private var pet: String = "小强"
  //对外公开的方法
  private def printPet(): Unit = {
    println(pet)
  }
  //money被this修饰，只能在类内部访问和使用，伴生对象也不可以
  private[this] var money: Double = 999.99
  //对外公开的方法
  def printMoney(): Unit ={
    println(money)
  }

}

/**
 * 伴生对象
 * 要求：
 * 1.用Object定义，object名字与类名一致
 * 2.object与class在同一个.scala文件中
 */
object User{
  def main(args: Array[String]): Unit = {

    val u = new User
    println(u.name)
    //在伴生对象中使用private修饰的变量、方法
    println(u.pet)
    u.printPet()

  }
}