/**
 * Created by sunmood on 2019/1/12.
 * 抽象处理类
 */
public abstract class Handler {
    protected Handler successor;//维持对下家的引用

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}

