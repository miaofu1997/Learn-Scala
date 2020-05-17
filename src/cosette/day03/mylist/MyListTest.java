package cosette.day03.mylist;

import java.util.Arrays;
import java.util.List;

/**
 * cosette.day03.mylist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 19:51
 * @Description:
 */
public class MyListTest {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"Hadoop","Spark","HBase","Flink","Hive"});

        //Java中的List没有map方法:做映射, 现在想扩展一个map方法

        //用装饰的方式: 在包装类中定义一个map方法
        MyList myList = new MyList(words);
        //在包装类中调用map方法, 传入运算逻辑(接口), 返回新的list
        MapFunction func = new MapFunction() {
            @Override
            public String apply(String word) {
                return word.toLowerCase() + "2.0";
            }
        };
        List<String> nList = myList.map(func);

        //Java8以后有lambda表达式, 就是一个引用类型, 匿名实现类的另外一种表现形式
        List<String> nList1 = myList.map(w -> w.toUpperCase());

        //查看结果
        for (String w : nList1){
            System.out.println(w);
        }

    }
}
