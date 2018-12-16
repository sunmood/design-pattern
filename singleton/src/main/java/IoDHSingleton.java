/**
 * Created by sunmood on 2018/12/15.
 * Initialization Demand Holder
 * 单例类中增加一个静态(static)内部类，
 * 在该内部类中创建单例对象，
 * 再将该单例对象通过getInstance()方法返回给外部使用
 */
public class IoDHSingleton {
    private IoDHSingleton(){}

    private static class HolderClass{
        private static final IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance(){
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton s1,s2;
        s1 = IoDHSingleton.getInstance();
        s2 = IoDHSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}
