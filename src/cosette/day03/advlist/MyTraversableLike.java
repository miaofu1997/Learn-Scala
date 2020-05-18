package cosette.day03.advlist;

import java.util.List;

/**
 * cosette.day03.advlist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 20:23
 * @Description: 定义共有的方法
 */
// MyTraversableLike<T>是泛型类, 以后T类型在方法中就可以使用了
public interface MyTraversableLike<T> {

    //泛型方法, 在返回值或void的前面, 加上泛型类上没定义的<R>, R才可以用

    /**
     * 做映射, 传入运算逻辑对数据进行处理, 返回一个新的List
     * @param func
     * @param <R>
     * @return
     */
    <R> List<R> map(MyFunction1<T, R> func);

    /**
     * 对原集合的数据进行过滤, 满足func的留下
     * @param func
     * @return
     */
    List<T> filter(MyFunction1<T, Boolean> func);

}
