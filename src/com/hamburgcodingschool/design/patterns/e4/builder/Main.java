package com.hamburgcodingschool.design.patterns.e4.builder;

public class Main {

    public static void main(String[] args) {

        CookieRobotBuilder cookieRobotBuilder = new CookieRobotBuilder();
        cookieRobotBuilder.addStart();
        cookieRobotBuilder.addGetParts();
        cookieRobotBuilder.addAssemble();
        cookieRobotBuilder.addTest();
        cookieRobotBuilder.addTest();
        cookieRobotBuilder.addStop();

        Robot robot = cookieRobotBuilder.buildRobot();
        robot.go();

        // TODO Make all methods of RobotBuilder return RobotBuilder (this), and chain the calls.
    }
}
