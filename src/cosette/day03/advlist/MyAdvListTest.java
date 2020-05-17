package cosette.day03.advlist;

import java.util.List;

/**
 * cosette.day03.advlist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 20:24
 * @Description:
 */
public class MyAdvListTest {

    public static void main(String[] args) {

        MyAdvList<String> words = new MyAdvList<>();
        words.add("Hadoop");
        words.add("Spark");
        words.add("Flink");
        words.add("HBase");
        words.add("Hive");

        MyAdvList<String> nList = words.map(new MyFunction1<String, String>() {
            @Override
            public String apply(String w) {
                return w.toLowerCase();
            }
        });

        for (String w: nList){
            System.out.println(w);
        }

        System.out.println("//////////////////////////");

        MyAdvList<Integer> nums = new MyAdvList<>();
        nums.add(1);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(4);

        MyAdvList<Double> mList = nums.map(new MyFunction1<Integer, Double>() {
            @Override
            public Double apply(Integer r) {
                return r * 10.0;
            }
        });

        for (Double m : mList){
            System.out.println(m);
        }

        System.out.println("//////////////////////////");

        //取出集合中的偶数
        MyAdvList<Integer> uList = nums.filter(new MyFunction1<Integer, Boolean>() {
            @Override
            public Boolean apply(Integer r) {
                return r % 2 == 0;
            }
        });

        for (Integer u : uList){
            System.out.println(u);
        }

        System.out.println("//////////////////////////");

        //函数式编程: 链式编程
        MyAdvList<Double> resultList = nums.filter(new MyFunction1<Integer, Boolean>() {
            @Override
            public Boolean apply(Integer r) {
                return r % 2 != 0;
            }
        }).map(new MyFunction1<Integer, Double>() {
            @Override
            public Double apply(Integer r) {
                return r * 10.0;
            }
        });

        for (Double result : resultList){
            System.out.println(result);
        }

        System.out.println("//////////////////////////");

        //用lambda表达式
        MyAdvList<Double> resultList1 = nums.filter(i -> i % 2 != 0).map(i -> i * 10.0);

        for (Double result1 : resultList1){
            System.out.println(result1);
        }

    }
}
