package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 17:24
 * @Description:
 */
object MyPredef {

  implicit val boy2OrderedBoy = (boy: Boy) => new Ordered[Boy] {
    override def compare(that: Boy): Int = {
      (boy.fv - that.fv).toInt
    }
  }

  implicit object OrderingMan extends Ordering[Man] {
    override def compare(x: Man, y: Man): Int = {
      x.age - y.age
    }
  }

}
