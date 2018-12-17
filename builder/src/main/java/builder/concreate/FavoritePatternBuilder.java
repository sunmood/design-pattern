package builder.concreate;

import builder.PlayerInterfaceBuilder;

/**
 * Created by sunmood on 2018/12/17.
 * 记忆模式建造者
 */
public class FavoritePatternBuilder extends PlayerInterfaceBuilder {
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

    @Override
    public boolean isBuildMenu() {
        return false;
    }

    @Override
    public boolean isBuildPlayList() {
        return false;
    }

    @Override
    public boolean isBuildFavoriteList() {
        return super.isBuildFavoriteList();
    }
}
