/**
 * Created by sunmood on 2019/1/12.
 * 具体处理类
 */
public class ConcreteHandler extends Handler {
    public void handleRequest(String request) {
        if ("条件" == "满足条件"){
            //处理请求
        }else {
            this.successor.handleRequest(request);
        }
    }
}
