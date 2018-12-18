package practice;

/**
 * Created by sunmood on 2018/12/18.
 * 可行性分析报告类
 */
public class FAR implements OfficeDocument {
    public OfficeDocument clone() {
        OfficeDocument far = null;

        try {
            far = (OfficeDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
