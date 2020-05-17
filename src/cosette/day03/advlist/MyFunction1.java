package cosette.day03.advlist;

/**
 * cosette.day03.advlist
 *
 * @Auther: Cosette
 * @Date: 2020/5/17 20:27
 * @Description:
 */
public interface MyFunction1<T, R> {

    /**
     * 定义一个规范: 输入一个T类型的参数 返回一个R
     * T和R可以是同一个类型
     * @param r
     * @return
     */
    R apply(T r);

}
