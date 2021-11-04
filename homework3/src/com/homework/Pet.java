package com.homework;

/**
 * // @PackageName:com.homework3
 * // @ClassName:Pet
 * // @Description:
 * // @author:作者
 * // @date:2021/9/29,16:03
 */
public class Pet {
    String name;
    String color;
    int age;
    int weight;
    double price;
    static int count;

    public Pet(String name, String color, int age, int weight, double price) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.price = price;
        count++;
    }
    public Pet(){
        name="小白";
        color="白色";
        age=2;
        weight=12;
        price=2300.0;
        count++;
    }
    void addPrice(double p){
        price=price+p;
    }
}
