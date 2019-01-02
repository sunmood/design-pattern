/**
 * Created by sunmood on 2019/1/2.
 * 抽象组件类
 */
public abstract class Component {
    public abstract void add(Component component);//增加成员
    public abstract void remove(Component component);//删除成员
    public abstract Component getChild(int i);//获取成员
    public abstract void operation();//业务操作
}

