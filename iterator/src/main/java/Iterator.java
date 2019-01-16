/**
 * Created by sunmood on 2019/1/14.
 * 抽象迭代器类
 */
public interface Iterator {
    void first();//将游标指向第一个元素
    void next();//将游标指向下一个元素
    boolean hasNext();//判断是否存在下一个元素
    Object currentItem();//获取游标当前指向的元素
}
