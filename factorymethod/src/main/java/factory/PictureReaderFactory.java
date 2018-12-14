package factory;

import reader.PictureReader;

/**
 * Created by sunmood on 2018/12/14.
 * 工厂接口
 */
public abstract class PictureReaderFactory {
    public void read(){
        PictureReader reader = this.getPictureReader();
        reader.read();
    }
    public abstract PictureReader getPictureReader();
}
