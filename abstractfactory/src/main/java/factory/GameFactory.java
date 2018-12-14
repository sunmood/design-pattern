package factory;

import product.InterfaceController;
import product.OperationController;

/**
 * Created by sunmood on 2018/12/14.
 * 游戏产品抽象工厂
 */
public abstract class GameFactory {
    public abstract OperationController getOperationController();
    public abstract InterfaceController getInterfaceController();
}
