package cosette.day02

/**
 * cosette.day02
 *
 * @Auther: Cosette
 * @Date: 2020/5/13 23:25
 * @Description:
 */
object WordCount {

  def main(args: Array[String]): Unit = {
    //数据
    val lines = List("hello tom hello jerry","hello tom jerry","hello hello tom")

    //切分压平 相当于先map再flatten
    val words: List[String] = lines.flatMap(line => line.split(" "))

    //将单词和1组合放到元组中
    val wordAndOne: List[(String, Int)] = words.map(w => (w, 1))

    //根据单词进行分组
    val grouped: Map[String, List[(String, Int)]] = wordAndOne.groupBy(tp => tp._1)

    //将单词和List的长度取出来 放到一个元组中
    val wordcounts: Map[String, Int] = grouped.map(tp => (tp._1, tp._2.size))

    //排序 map不支持排序 先转成list
    val listWordCounts: List[(String, Int)] = wordcounts.toList

    //排序
    val result: List[(String, Int)] = listWordCounts.sortBy(tp => -tp._2)

    println(result)


    //或者不需要和1组合起来 直接group 再和key组合起来
    val grouped2: Map[String, List[String]] = words.groupBy(w => w)

    val values = grouped2.mapValues(x => x.size).toList.sortBy(tp => tp._2)

    println(values)


  }

}
