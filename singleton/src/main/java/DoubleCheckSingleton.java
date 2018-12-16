/**
 * Created by sunmood on 2018/12/15.
 * 双重检验锁单例，解决了LazySingleton的高并发性能能问题。
 * 使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，
 * 被volatile修饰的成员变量可以确保多个线程都能够正确处理，
 * 且该代码只能在JDK 1.5及以上版本中才能正确执行。
 * 由于volatile关键字会屏蔽Java虚拟机所做的一些代码优化，可能会导致系统运行效率降低，
 * 因此即使使用双重检查锁定来实现单例模式也不是一种完美的实现方式。
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if (instance == null){
            //锁定代码块
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }

        return instance;
    }
}
