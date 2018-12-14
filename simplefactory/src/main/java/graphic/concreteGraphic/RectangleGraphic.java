package graphic.concreteGraphic;

import graphic.Graphic;

/**
 * Created by sunmood on 2018/12/13.
 * 方形类
 */
public class RectangleGraphic implements Graphic {
    public void draw() {
        System.out.println("绘制方形");
    }

    public void erase() {
        System.out.println("擦除方形");
    }
}
