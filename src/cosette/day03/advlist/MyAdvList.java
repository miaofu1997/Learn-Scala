package cosette.day03.advlist;

import java.util.ArrayList;
import java.util.List;

/**
 * cosette.day03.advlist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 20:17
 * @Description: 1.具备ArrayList所有功能
 *               2.扩展了map/filter/reduce等所有方法
 *               3.支持链式编程
 *               4.支持传入多种数据类型
 */
public class MyAdvList<T> extends ArrayList<T> implements MyTraversableLike<T> {

    @Override
    public <R> MyAdvList<R> map(MyFunction1<T, R> func) {
        //定义一个新的List
        MyAdvList<R> nList = new MyAdvList<>();
        //循环老List
        for(T t : this){
            //应用外部传入的逻辑
            R r = func.apply(t);
            nList.add(r);
        }
        return nList;
    }

    @Override
    public MyAdvList<T> filter(MyFunction1<T, Boolean> func) {
        //定义一个新的List
        MyAdvList<T> nList = new MyAdvList<T>();
        //循环老List
        for(T t : this){
            //应用外部传入的逻辑
            Boolean flag = func.apply(t);
            if(flag){
                //满足条件加入到新list
                nList.add(t);
            }
        }
        return nList;
    }
}
