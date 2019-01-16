import java.util.HashMap;

/**
 * Created by sunmood on 2019/1/14.
 * 环境类
 */
public class Context {
    private HashMap map = new HashMap();
    public void assign(String key, String value){
        //往环境类中设值
        map.put(key,value);
    }
    public String lookup(String key){
        return (String) map.get(key);
    }
}
