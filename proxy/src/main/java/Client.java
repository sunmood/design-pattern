/**
 * Created by sunmood on 2019/1/3.
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.process();
    }
}
