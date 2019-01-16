/**
 * Created by sunmood on 2019/1/15.
 * 原发器类
 */
public class Originator {
    private String state;

    public Originator(){}

    /**
     * 创建一个备忘录对象
     * @return
     */
    public Memento createMemento(){
        return new Memento(this);
    }

    /**
     * 根据备忘录对象恢复原发器对象的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        state = memento.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
