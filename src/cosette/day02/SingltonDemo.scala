package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 11:32
 * @Description:
 */
import scala.collection.mutable.ArrayBuffer

object SingletonDemo {
  def main(args: Array[String]) {
    //单例对象，不需要new，用【类名.方法】调用对象中的方法
    val session1 = SessionFactory.getSession()
    println(SessionFactory) //两种方式一样
    println(session1)
    val session2 = SessionFactory.getSession()
    val sf = SessionFactory
    println(sf) //两种方式一样
    println(session2)
  }
}

object SessionFactory { //进行会话的对象，只需要一个这样都“工厂”生产出session就可以了
  //该部分相当于java中的静态块
  var counts = 5
  val sessions = new ArrayBuffer[Session]()
  while(counts > 0){
    sessions += new Session
    counts -= 1
  }

  //在object中的方法相当于java中的静态方法
  def getSession(): Session ={
    sessions.remove(0)
  }

}

class Session { //以后要生产多个实例。

}
