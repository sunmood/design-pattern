/**
 * Created by sunmood on 2019/1/2.
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void  playMusic(){
        subSystem.turnOnRadio();
        subSystem.setCD();
        subSystem.start();
    }
}
