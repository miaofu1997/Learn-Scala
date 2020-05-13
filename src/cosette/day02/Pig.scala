package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 16:01
 * @Description:
 */
//Scala中，第一次无论是继承还是实现特质，都使用extends关键字。
class Pig extends Flyable with Fightable {
  override def fly(): Unit = {
    println("风口的猪肉")
  }
}

object Pig {
  def main(args: Array[String]): Unit = {
    val p = new Pig
    p.fight()
    p.fly()
  }
}