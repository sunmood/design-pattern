/**
 * Created by sunmood on 2018/12/14.
 * 懒汉式单例
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    /**
     * 获取单例实例
     * 该方法可以保证线程安全，但在多线程高并发环境中系统性能低
     * @see DoubleCheckSingleton
     * @return
     */
    synchronized public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
