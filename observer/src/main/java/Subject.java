import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunmood on 2019/1/15.
 * 抽象目标类
 */
public abstract class Subject {
    protected List<Observer> observerList = new ArrayList<Observer>();//用来存储观察者对象的集合

    /**
     * 注册方法，用来注册观察者对象
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
    }

    /**
     * 注销方法，用来注销观察者对象
     * @param observer
     */
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 抽象通知方法
     */
    public abstract void notifyObserver();

}
