package factory;

import reader.JPGReader;
import reader.PictureReader;

/**
 * Created by sunmood on 2018/12/14.
 */
public class JPGReaderFactory implements PictureReaderFactory {
    public PictureReader getPictureReader() {
        return new JPGReader();
    }
}
