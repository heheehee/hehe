package com.homeworkAdd;

public class Application {
    public static void main(String[] args) {
        Simulator simulator= new Simulator();
        simulator.playground(new Dog());
        simulator.playground(new Cat());
    }
}
