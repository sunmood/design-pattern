import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmood on 2019/1/2.
 * 容器组件
 */
public class Composite extends Component {
    List<Component> componentList = new ArrayList<Component>();
    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Component getChild(int i) {
        return componentList.get(i);
    }

    public void operation() {
        System.out.println("容器组件业务操作。");
        for (Component component : componentList){
            component.operation();
        }
    }
}
