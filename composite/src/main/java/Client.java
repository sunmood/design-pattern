/**
 * Created by sunmood on 2019/1/2.
 * 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        Component composite3 = new Composite();

        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        composite1.add(composite2);
        composite1.add(composite3);
        composite1.add(leaf1);
        composite2.add(leaf2);
        composite3.add(leaf3);

        composite1.operation();
    }
}
