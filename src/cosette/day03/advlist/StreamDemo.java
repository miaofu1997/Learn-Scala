package cosette.day03.advlist;

import scala.actors.threadpool.Arrays;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * cosette.day03.advlist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 21:01
 * @Description:
 */
public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> nums = java.util.Arrays.asList(1,2,4,5,6,7);

        //使用Java的Stream
        Optional<Integer> reduce = nums.stream().filter(i -> i % 2 == 0).map(i -> i * i).reduce((a, b) -> a + b);
        Integer r = reduce.get();
        System.out.println(r);

        System.out.println("//////////////////////////");

        Stream<Integer> integerStream = nums.stream().filter(i -> i % 2 == 0).map(i -> i * i);

//        Iterator<Integer> iterator = integerStream.iterator();
//        while (iterator.hasNext()){
//            Integer re = iterator.next();
//            System.out.println(re);
//        }

//        integerStream.forEach(i -> System.out.println(i));
        integerStream.forEach(System.out::println);

    }

}
