package com.hamburgcodingschool.design.patterns.e4.builder;

public class CookieRobot extends Robot {

    @Override
    public void start() {
        System.out.println("Starting...");
    }

    @Override
    public void getParts() {
        System.out.println("Getting flour and sugar...");
    }

    @Override
    public void assemble() {
        System.out.println("Baking a cookies...");
    }

    @Override
    public void test() {
        System.out.println("Crunching a cookie...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }
}
