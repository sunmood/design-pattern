package factory;

import org.junit.Test;
import product.InterfaceController;
import product.OperationController;

/** 
* GameFactory Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 14, 2018</pre> 
* @version 1.0 
*/ 
public class GameFactoryTest { 

    @Test
    public void testGameFactory() throws Exception {
        GameFactory gameFactory = new AndroidGameFactory();
        InterfaceController interfaceController = gameFactory.getInterfaceController();
        OperationController operationController = gameFactory.getOperationController();

        interfaceController.display();
        operationController.operate();
    }

} 
