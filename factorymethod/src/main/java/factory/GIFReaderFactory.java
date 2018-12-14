package factory;

import reader.GIFReader;
import reader.PictureReader;

/**
 * Created by sunmood on 2018/12/14.
 */
public class GIFReaderFactory implements PictureReaderFactory {
    public PictureReader getPictureReader() {
        return new GIFReader();
    }
}
