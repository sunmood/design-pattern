package builder;

import player.PlayerInterface;

/**
 * Created by sunmood on 2018/12/17.
 * 界面建造者
 */
public abstract class PlayerInterfaceBuilder {
    protected PlayerInterface playerInterface = new PlayerInterface();

    public abstract void buildMenu();
    public abstract void buildPlayList();
    public abstract void buildMainWindow();
    public abstract void buildControlBar();
    public abstract void buildFavoriteList();

    public boolean isBuildMenu(){
        return true;
    }

    public boolean isBuildPlayList(){
        return true;
    }

    public boolean isBuildFavoriteList(){
        return true;
    }

    public PlayerInterface createPlayerInterface(){
        return playerInterface;
    }
}
