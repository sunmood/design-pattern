package factory;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* PictureReaderFactory Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ���� 14, 2018</pre> 
* @version 1.0 
*/ 
public class PictureReaderFactoryTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: read() 
* 
*/ 
@Test
public void testRead() throws Exception { 
    PictureReaderFactory readerFactory = new JPGReaderFactory();
    readerFactory.read();
} 

/** 
* 
* Method: getPictureReader() 
* 
*/ 
@Test
public void testGetPictureReader() throws Exception { 
//TODO: Test goes here... 
} 


} 
