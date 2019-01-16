/**
 * Created by sunmood on 2019/1/15.
 * 备忘录类
 */
public class Memento {
    private String state;

    public Memento(Originator originator) {
        state = originator.getState();
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
