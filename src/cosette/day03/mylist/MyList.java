package cosette.day03.mylist;

import java.util.ArrayList;
import java.util.List;

/**
 * cosette.day03.mylist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 19:51
 * @Description:
 */
public class MyList {

    private List<String> words;
    public MyList(List<String> words) {
        this.words = words;

    }

    public List<String> map(MapFunction func) {
        //定义好新的数组(可变集合)用来装转换后的数据
        List<String> nList = new ArrayList<>();
        //循环老List
        for(String word: words) {
            //应用外部传过来的逻辑
            String nWord = func.apply(word);
            //将新单词添加到新list
            nList.add(nWord);
        }

        return nList;
    }
}
