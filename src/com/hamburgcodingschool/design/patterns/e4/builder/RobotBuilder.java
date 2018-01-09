package com.hamburgcodingschool.design.patterns.e4.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class RobotBuilder {
    private Robot robot;
    private List<Integer> actions;

    public RobotBuilder(Robot robot) {
        this.robot = robot;
        actions = new ArrayList<>();
    }

    public void addStart() {
        actions.add(1);
    }

    public void addGetParts() {
        actions.add(2);
    }

    public void addAssemble() {
        actions.add(3);
    }

    public void addTest() {
        actions.add(4);
    }

    public void addStop() {
        actions.add(5);
    }

    public Robot buildRobot() {
        robot.loadActions(actions);
        return robot;
    }
}
