package com.vinod.learnspringframework.game;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;

    }

    public void run() {
        System.out.println("Running game: "+game.getClass().getName());
    }
}
