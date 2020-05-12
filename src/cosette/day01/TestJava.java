package cosette.day01;

//import com.sun.tools.javac.code.Attribute;

import java.util.ArrayList;
import java.util.List;

public class TestJava {

    public static void main(String[] args) {

        String str = "ABCDEFG";

        char c = str.charAt(0);

        System.out.println(c);


        for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= 3; j++) {

                if(i != j) {

                    System.out.println(i * 10 + j);

                }

            }
        }


        int arr[] = {1,2,3,4,5,6,7};
        List<Integer> nums = new ArrayList<>();
        for(int i: arr) {
            if(i % 2 == 0) {
                nums.add(i * 100);
            }
        }
//        Integer[] objects =(Integer[]) nums.toArray();




    }
}
