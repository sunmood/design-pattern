package player;

/**
 * Created by sunmood on 2018/12/17.
 * 播放器界面
 */
public class PlayerInterface {
    private String menu;//菜单
    private String playList;//播放列表
    private String mainWindow;//主窗口
    private String controlBar;//控制条
    private String favoriteList;//收藏列表

    @Override
    public String toString() {
        return "player.PlayerInterface{" +
                "menu='" + menu + '\'' +
                ", playList='" + playList + '\'' +
                ", mainWindow='" + mainWindow + '\'' +
                ", controlBar='" + controlBar + '\'' +
                ", favoriteList='" + favoriteList + '\'' +
                '}';
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(String favoriteList) {
        this.favoriteList = favoriteList;
    }
}
