/**
 * Created by sunmood on 2019/1/3.
 */
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = FlyWeightFactory.getFlyWeightFactory();
        FlyWeight flyWeight = flyWeightFactory.getFlyWeight("aaa");
        flyWeight.operation("123");
        FlyWeight flyWeight1 = flyWeightFactory.getFlyWeight("aaa");
        flyWeight1.operation("123");
        FlyWeight flyWeight2 = flyWeightFactory.getFlyWeight("a2bb");
        flyWeight2.operation("123");

        System.out.println(flyWeight == flyWeight1);
        System.out.println(flyWeight == flyWeight2);
    }
}
