/**
 * Created by sunmood on 2018/12/14.
 * 饿汉式单例
 * 当类被加载时，静态变量instance会被初始化，
 * 此时类的私有构造函数会被调用，单例类的唯一实例将被创建。
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}
