package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 16:08
 * @Description:
 */
class Dog extends Fightable {

  override def fight(): Unit = {
    println("咬你")
  }

}

object Dog {
  def main(args: Array[String]): Unit = {

    //可以在new对象的时候动态实现新增功能
    val d = new Dog with Flyable {
      override def fly(): Unit = {
        println("狗也会飞！")
      }
    }
    d.fight()
    d.fly() //只有这个d里面 有fly方法

  }
}


class MyDog extends Dog with Flyable {
  override def fly(): Unit = {

  }
}