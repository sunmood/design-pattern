package practice;

import java.util.Hashtable;

/**
 * Created by sunmood on 2018/12/18.
 * 原型管理器
 * 使用饿汉式单例实现
 */
public class PrototypeManager {
    private Hashtable hashtable = new Hashtable();
    private static PrototypeManager prototypeManager = new PrototypeManager();

    private PrototypeManager(){
        hashtable.put("far",new FAR());
        hashtable.put("srs",new SRS());
    }

    /**
     * 增加新的公文对象
     * @param key
     * @param document
     */
    public void addOfficeDocument(String key, OfficeDocument document){
        hashtable.put(key,document);
    }

    /**
     * 通过浅克隆获取新的对象
     * @param key
     * @return
     */
    public OfficeDocument getOfficeDocument(String key){
        return ((OfficeDocument) hashtable.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }
}
