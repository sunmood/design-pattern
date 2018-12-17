package controller;

import builder.PlayerInterfaceBuilder;
import player.PlayerInterface;

/**
 * Created by sunmood on 2018/12/17.
 * 指挥者类
 */
public class PlayerInterfaceController {
    public PlayerInterface construct(PlayerInterfaceBuilder playerInterfaceBuilder){
        PlayerInterface playerInterface;

        playerInterfaceBuilder.buildMainWindow();
        playerInterfaceBuilder.buildControlBar();
        if (playerInterfaceBuilder.isBuildFavoriteList()){
            playerInterfaceBuilder.buildFavoriteList();
        }
        if (playerInterfaceBuilder.isBuildMenu()){
            playerInterfaceBuilder.buildMenu();
        }
        if (playerInterfaceBuilder.isBuildPlayList()){
            playerInterfaceBuilder.buildPlayList();
        }
        playerInterface = playerInterfaceBuilder.createPlayerInterface();

        return playerInterface;
    }
}
