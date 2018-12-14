package factory;

import exception.UnSupportedShapeException;
import graphic.Graphic;
import graphic.concreteGraphic.CircleGraphic;
import graphic.concreteGraphic.RectangleGraphic;
import graphic.concreteGraphic.TriangleGraphic;

/**
 * Created by sunmood on 2018/12/13.
 * 图形工厂类
 */
public class GraphicFactory {
    public static Graphic getGraphic(String type){
        if (type.equalsIgnoreCase("circle")){
            return new CircleGraphic();
        } else if (type.equalsIgnoreCase("triangle")){
            return new TriangleGraphic();
        } else if (type.equalsIgnoreCase("rectangle")){
            return new RectangleGraphic();
        } else {
            throw new UnSupportedShapeException("不支持的图形！");
        }
    }
}
