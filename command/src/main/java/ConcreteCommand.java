/**
 * Created by sunmood on 2019/1/4.
 * 具体命令类
 */
public class ConcreteCommand extends Command {
    Handler handler = new Handler();
    public void execute() {
        handler.handle();
    }
}
