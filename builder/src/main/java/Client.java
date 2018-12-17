import builder.concreate.FavoritePatternBuilder;
import builder.concreate.FullPatternBuilder;
import builder.concreate.SimplePatternBuilder;
import controller.PlayerInterfaceController;
import player.PlayerInterface;

/**
 * Created by sunmood on 2018/12/17.
 */
public class Client {
    public static void main(String[] args) {
        PlayerInterfaceController controller = new PlayerInterfaceController();
        PlayerInterface playerInterface = controller.construct(new FavoritePatternBuilder());
        System.out.println("记忆模式：" + playerInterface.toString());
        playerInterface = controller.construct(new FullPatternBuilder());
        System.out.println("完整模式：" + playerInterface.toString());
        playerInterface = controller.construct(new SimplePatternBuilder());
        System.out.println("精简模式：" + playerInterface.toString());
    }
}
