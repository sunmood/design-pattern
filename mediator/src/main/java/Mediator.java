import java.util.ArrayList;

/**
 * Created by sunmood on 2019/1/15.
 * 抽象中介者类
 */
public abstract class Mediator {
    protected ArrayList<Colleague> colleagues;

    public void register(Colleague colleague){
        colleagues.add(colleague);
    }

    public abstract void operation();
}
