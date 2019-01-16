/**
 * Created by sunmood on 2019/1/15.
 * 抽象状态类
 */
public abstract class State {

    /**
     * 声明抽象业务方法，不同的具体状态类提供不同的实现
     */
    public abstract void handle();
}
