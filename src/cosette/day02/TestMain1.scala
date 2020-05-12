package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/12 15:40
 * @Description:
 */
object TestMain1 {
  def main(args: Array[String]): Unit = {

    // new了一个实例
    val s1 = new Student

    s1.name = "Cosette"
    s1.age = 23
    s1.faceValue = 99.99

//    println(s1.id)
    println(s1.name)
    println(s1.age)
    println(s1.faceValue)
//    s1.id = "u0002" 在Scala中用Val定义的成员变量不可以重新赋值

    println("///////////////////////")

    val s2 = new Student

    s2.name = "Freya"
    s2.age = 18
    s2.faceValue = 89.99

    println(s2.name)
    println(s2.age)
    println(s2.faceValue)

    println("///////////////////////")

    val u = new User
    u.name = "David"
    println(u.name)

    //Scala中private修饰的变量或者方法，在其他类或Object中无法访问，只能在类的内部或伴生对象访问。
//    u.pet
//    u.printPet()
    u.printMoney()

    println("///////////////////////")
    val p = new Person
    println(p.name)
//    println(Person.nation)

  }

}
