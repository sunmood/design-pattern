/**
 * Created by sunmood on 2019/1/15.
 * 具体目标类
 */
public class ConcreteSubject extends Subject {
    public void notifyObserver() {
        for (Observer observer : observerList){
            observer.update();
        }
    }
}
