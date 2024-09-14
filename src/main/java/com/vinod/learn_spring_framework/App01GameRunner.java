package com.vinod.learn_spring_framework;

import com.vinod.learnspringframework.game.GameRunner;
import com.vinod.learnspringframework.game.PacMan;

public class App01GameRunner {
    public static void main(String[] args) {
       // var game = new SuperContra();
       // var game = new MarioGame();
       var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
