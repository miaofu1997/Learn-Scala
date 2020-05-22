package cosette.day05

import java.io.File

/**
 * cosette.day05
 *
 * @Auther: Cosette
 * @Date: 2020/5/22 10:35
 * @Description:
 */
object MyContext {

  implicit val abcd: Int = 7777

  //定义方法，将file转换成RichFile
  //相当于事先将file包装成RichFile准备好了
  implicit def file2RichFile(file: File): RichFile = {
    println("Method Invoke")
    new RichFile(file)
  }

  implicit val fileToRichFile = (file: File) => {
    println("Function Invoke")
    new RichFile(file)
  }

}
