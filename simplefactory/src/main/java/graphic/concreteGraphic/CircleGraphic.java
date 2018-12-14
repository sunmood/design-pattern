package graphic.concreteGraphic;

import graphic.Graphic;

/**
 * Created by sunmood on 2018/12/13.
 * 圆形类
 */
public class CircleGraphic implements Graphic {
    public void draw() {
        System.out.println("绘制圆形");
    }

    public void erase() {
        System.out.println("擦除圆形");
    }
}
