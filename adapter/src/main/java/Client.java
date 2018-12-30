/**
 * Created by sunmood on 2018/12/26.
 * 客户端测试类
 */
public class Client {


    public static void main(String[] args) {
        int[] arr = {1,4,8,2,5,3,8,4};
        Target target = new Adapter();
        target.sort(arr);
        target.search(arr,3);
    }
}
