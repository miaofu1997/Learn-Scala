package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 09:55
 * @Description:
 */
class User2(val name: String, var age: Int) {
  //主构造器的参数比辅助构造器的参数还要多，就还要传值
  //定义辅助构造器其实是对主构造器的扩展和补充
  def this(name: String){
    this(name, 0)
  }
}

class User3(val name: String) {
  var a: Int = _
  //对主构造器的扩展和补充
  def this(name: String, age: Int){
    this(name)
    this.a = age
  }
}

//如果定义主构造器时，参数没有用val或var修饰，参数就不会成为成员变量，但在方法里还是可以用。
//和private的区别是不能被继承。
class User4(val name: String, var age: Int, private[this] var password: String,gender: String) {
  def printG(): Unit = {
    println(gender)
  }

}

object User4 {
  def main(args: Array[String]): Unit = {
    val u = new User4("Cosie", 18,"pwd","female")
    u.printG()
  }
}

//将构造器私有化，只有自己的伴生对象可以用
class User5 private(val name: String) {

}

object User5 {
  def main(args: Array[String]): Unit = {
    val u = new User5("user5")
  }
}

class User6 {
  var age: Int = _

  //相当于主构造器中执行的逻辑，比如简单运算、访问数据库等。new对象时就执行。
  println("123456")

  var gender: String = "male"

  //捕获异常，继续执行
  try {
    println(1 * 100 / 0)
  } catch {
    case e: Exception =>{
      e.printStackTrace()
    }
  }
  println("88888")

  //方法只被加载，没被调用
  def sayHello()={
    println("Hello")
  }

  User6.sayHi()

}

object User6 {

  def sayHi()={
    println("Hi")
  }

  def main(args: Array[String]): Unit = {
    val u1 = new User6
  }
}