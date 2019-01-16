/**
 * Created by sunmood on 2019/1/3.
 */
public class Proxy implements Subject {
    RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void process() {
        preProcess();
        realSubject.process();
    }

    private void preProcess(){
        System.out.println("预处理。。");
    }
}
