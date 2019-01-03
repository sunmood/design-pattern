import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunmood on 2019/1/3.
 */
public class FlyWeightFactory {
    private static FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
    private static Map<String,FlyWeight> flyWeightMap = new HashMap<String, FlyWeight>();

    private FlyWeightFactory(){}

    public static FlyWeightFactory getFlyWeightFactory(){
        return flyWeightFactory;
    }

    public FlyWeight getFlyWeight(String key){
        if (flyWeightMap.containsKey(key)){
            return flyWeightMap.get(key);
        } else {
            FlyWeight flyWeight = new ConcreteFlyWeight(key);
            flyWeightMap.put(key,flyWeight);
            return flyWeightMap.get(key);
        }
    }
}
