package com.vinod.learn_spring_framework;

public class AppGameRunner {
    public static void main(String[] args) {
       // var game = new SuperContra();
        //var game = new MarioGame();
        var game = new PacMan();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
