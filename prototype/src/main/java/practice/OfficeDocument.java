package practice;

/**
 * Created by sunmood on 2018/12/18.
 * 抽象文档接口
 */
public interface OfficeDocument extends Cloneable {
    OfficeDocument clone();
    void display();
}
