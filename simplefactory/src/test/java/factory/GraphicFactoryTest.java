package factory;

import graphic.Graphic;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* GraphicFactory Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 13, 2018</pre> 
* @version 1.0 
*/ 
public class GraphicFactoryTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getGraphic(String type) 
* 
*/ 
@Test
public void testGetGraphic() throws Exception {
    Graphic graphic = GraphicFactory.getGraphic("circle11");
    graphic.draw();
    graphic.erase();
} 


} 
