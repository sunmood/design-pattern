package graphic.concreteGraphic;

import graphic.Graphic;

/**
 * Created by sunmood on 2018/12/13.
 * 三角形类
 */
public class TriangleGraphic implements Graphic {
    public void draw() {
        System.out.println("绘制三角形");
    }

    public void erase() {
        System.out.println("擦除三角形");
    }
}
