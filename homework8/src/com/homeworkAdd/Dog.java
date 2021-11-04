package com.homeworkAdd;

public class Dog extends Animal{

    @Override
    public void cry() {
        System.out.println("小狗汪汪叫");
    }

    @Override
    public String getAnimalName() {
        return "小狗";
    }
}
