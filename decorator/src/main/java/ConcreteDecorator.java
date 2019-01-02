/**
 * Created by sunmood on 2019/1/2.
 * 具体装饰类
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        component.operation();
        addBehavior();
    }

    public void addBehavior(){
        System.out.println("具体装饰类新增方法。。。");
    }
}
