package cosette.day05

import java.io.File

import scala.io.Source

import MyContext._


/**
 * cosette.day05
 * @Auther: Cosette
 * @Date: 2020/5/22 14:12
 * 隐式转换的本质，就是对类和方法的增强和扩展
 * 隐式转换就是装饰模式的特殊表现形式，scala编译器在语法上就支持，只有用一个implicit关键字就可以了
 * 隐式转换就是在编译时，取上下文中取查找【类型是否一致、转换另外的类型就有其他的方法了】
 *
 * @param file
 */
class RichFile(val file: File) {

  def read(): String = {
    Source.fromFile(file).mkString
  }

}


object RichFile {

  def main(args: Array[String]): Unit = {

    //读取指定文件中的全部内容，返回一个字符串
    val file = new File("C:/Users/lenovo/Desktop/a.txt")

    //val content = file.read()

    //显式的进行了包装，但是用起来太麻烦
//    val richFile = new RichFile(file)
//    val content = richFile.read()
//    println(content)

    //不用RichFile包装，用隐式转换，直接调用read方法
    val content: String = file.read()
    println(content)
  }
}