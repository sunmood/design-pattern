package factory;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import reader.PictureReader;

/** 
* JPGReaderFactory Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 14, 2018</pre> 
* @version 1.0 
*/ 
public class JPGReaderFactoryTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getPictureReader() 
* 
*/ 
@Test
public void testGetPictureReader() throws Exception {
    PictureReaderFactory factory = new GIFReaderFactory();
    PictureReader reader = factory.getPictureReader();
    reader.read();
} 


} 
