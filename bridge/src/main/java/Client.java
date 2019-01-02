/**
 * Created by sunmood on 2018/12/31.
 * 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        DataConverter converter = new PDFConverter();
        converter.setDataBase(new OracleAdapter());
        converter.getFile();
    }
}
