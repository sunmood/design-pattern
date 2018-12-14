package factory;

import product.InterfaceController;
import product.OperationController;
import product.ios.IOSInterfaceController;
import product.ios.IOSOperationController;

/**
 * Created by sunmood on 2018/12/14.
 */
public class IOSGameFactory extends GameFactory {
    public OperationController getOperationController() {
        return new IOSOperationController();
    }

    public InterfaceController getInterfaceController() {
        return new IOSInterfaceController();
    }
}
