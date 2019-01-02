/**
 * Created by sunmood on 2018/12/31.
 * 抽象数据转换类
 */
public abstract class DataConverter {

    protected DataBaseImpl dataBase;

    public void setDataBase(DataBaseImpl dataBase) {
        this.dataBase = dataBase;
    }

    public abstract void convert();

    public void getFile(){
        this.dataBase.connectDataBase();
        this.convert();
    }
}
