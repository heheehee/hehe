package com.homeworkAdd;

public class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println("小猫喵喵叫");
    }

    @Override
    public String getAnimalName() {
        return "小猫";
    }
}