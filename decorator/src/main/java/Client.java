/**
 * Created by sunmood on 2019/1/2.
 * 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        Component component,decorator;
        component = new ConcreteComponent();
        decorator = new ConcreteDecorator(component);

        decorator.operation();
    }
}
