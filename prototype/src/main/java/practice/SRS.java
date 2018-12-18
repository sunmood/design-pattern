package practice;

/**
 * Created by sunmood on 2018/12/18.
 * 软件需求规格说明书
 */
public class SRS implements OfficeDocument {
    public OfficeDocument clone() {
        OfficeDocument srs = null;

        try {
            srs = (OfficeDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return srs;
    }

    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
