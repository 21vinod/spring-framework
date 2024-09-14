package com.vinod.learn_spring_framework;

public class PacMan implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("into the Hole");
    }
    public void left(){
        System.out.println("back");
    }
    public void right(){
        System.out.println("forward");
    }
}
