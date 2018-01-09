package com.hamburgcodingschool.design.patterns.e4.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Robot {

    private List<Integer> actions = new ArrayList<>(0);

    public abstract void start();

    public abstract void getParts();

    public abstract void assemble();

    public abstract void test();

    public abstract void stop();

    public void loadActions(List<Integer> actions) {
        this.actions = actions;
    }

    public void go() {
        for (Integer i : actions) {
            switch (i) {
                case 1:
                    start();
                    break;
                case 2:
                    getParts();
                    break;
                case 3:
                    assemble();
                    break;
                case 4:
                    test();
                    break;
                case 5:
                    stop();
                    break;
            }
        }
    }
}
