package factory;

import product.InterfaceController;
import product.OperationController;
import product.android.AndroidInterfaceController;
import product.android.AndroidOperationController;

/**
 * Created by sunmood on 2018/12/14.
 */
public class AndroidGameFactory extends GameFactory {
    public OperationController getOperationController() {
        return new AndroidOperationController();
    }

    public InterfaceController getInterfaceController() {
        return new AndroidInterfaceController();
    }
}
