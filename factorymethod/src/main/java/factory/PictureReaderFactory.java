package factory;

import reader.PictureReader;

/**
 * Created by sunmood on 2018/12/14.
 * 工厂接口
 */
public interface PictureReaderFactory {
    PictureReader getPictureReader();
}
