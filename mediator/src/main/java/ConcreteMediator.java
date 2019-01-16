/**
 * Created by sunmood on 2019/1/15.
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {
    /**
     * 根据业务通知相应的同事类进行相应的操作
     */
    public void operation() {
        colleagues.get(0).method1();
    }
}
