package com.hamburgcodingschool.design.patterns.e4.builder;

public class AutomotiveRobot extends Robot {

    @Override
    public void start() {
        System.out.println("Starting...");
    }

    @Override
    public void getParts() {
        System.out.println("Getting automotive parts...");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling automotive parts...");
    }

    @Override
    public void test() {
        System.out.println("Revving the engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
}
