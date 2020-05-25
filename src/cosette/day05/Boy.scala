package cosette.day05

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 17:17
 * @Description:
 */

//将比较规则和类耦合在一起了
//class Boy(val name: String, var fv: Double) extends Comparable[Boy]{

class Boy(val name: String, var fv: Double){

  override def toString: String = s"Boy($name,$fv)"

//  override def compareTo(o: Boy): Int = {
//    (this.fv - o.fv).toInt
//  }

}
