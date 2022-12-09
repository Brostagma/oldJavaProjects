package com.brostagma.main;

public enum GameStates {
    
    PLAYING,MENU,SETTINGS;

    public static GameStates gameStates = MENU;

    public static void SET_GAME_STATE(GameStates state) {
        gameStates = state;
    }

    public final static String FILE_PATH = "/sprites/spriteatlas.png";
    public final static String STATIC_FILE_PATH = "sprites/spriteatlas.png";
}
