package builder.concreate;

import builder.PlayerInterfaceBuilder;

/**
 * Created by sunmood on 2018/12/17.
 * 完整模式建造者
 */
public class FullPatternBuilder extends PlayerInterfaceBuilder {

    public void buildMenu() {
        playerInterface.setMenu("菜单");
    }

    public void buildPlayList() {
        playerInterface.setPlayList("播放列表");
    }

    public void buildMainWindow() {
        playerInterface.setMainWindow("主窗口");
    }

    public void buildControlBar() {
        playerInterface.setControlBar("控制条");
    }

    public void buildFavoriteList() {
        playerInterface.setFavoriteList("收藏列表");
    }
}
