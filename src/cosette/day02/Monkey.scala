package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 15:46
 * @Description: 继承
 */
class Monkey extends Animal with Flyable with Fightable {

  override def run(): Unit = {
    println("蹦蹦跳跳的走")
  }

  override def fly(): Unit = {
    println("乘筋斗云飞")
  }

  //重写那些已经有实现的方法，就一定要用override关键字
  override def fight(): Unit = {
    println("使用金箍棒打")
  }
}

object Monkey {

  def main(args: Array[String]): Unit = {
    val m = new Monkey
    m.run()
    m.breath()
    m.fly()
    m.fight()

    //多态：父类引用指向子类对象（接口指向实现类）；方法的重写
    val a: Animal = new Monkey
    a.run()
  }

}
