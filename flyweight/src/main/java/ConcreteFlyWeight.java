/**
 * Created by sunmood on 2019/1/3.
 * 具体享元类
 */
public class ConcreteFlyWeight extends FlyWeight {
    private String intrinsic;

    public ConcreteFlyWeight(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public void operation(String extrinsicState) {
        System.out.println(this.intrinsic + "----" + extrinsicState);
    }
}
