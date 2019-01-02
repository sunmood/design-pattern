/**
 * Created by sunmood on 2019/1/2.
 * 抽象装饰类
 */
public class Decorator extends Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
