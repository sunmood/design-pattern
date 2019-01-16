/**
 * Created by sunmood on 2019/1/4.
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand());
        invoker.call();
    }
}


