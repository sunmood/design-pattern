package practice;

/**
 * Created by sunmood on 2018/12/18.
 */
public class Client {
    public static void main(String[] args) {
        //获取原型管理器对象
        PrototypeManager pm =  PrototypeManager.getPrototypeManager();

        OfficeDocument  doc1,doc2,doc3,doc4;

        doc1  = pm.getOfficeDocument("far");
        doc1.display();
        doc2  = pm.getOfficeDocument("far");
        doc2.display();
        System.out.println(doc1  == doc2);

        doc3  = pm.getOfficeDocument("srs");
        doc3.display();
        doc4  = pm.getOfficeDocument("srs");
        doc4.display();
        System.out.println(doc3  == doc4);
    }
}
