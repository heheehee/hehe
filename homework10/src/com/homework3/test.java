package com.homework3;

public class test {
    public static void main(String[] args) {
        Square square=new Square();
        Circle circle=new Circle();
        double area1=circle.area(3);
        double area2=square.area(2);
        System.out.println("半径为3的圆的面积是:"+area1);
        System.out.println("边长为2的正方形面积是:"+area2);
    }
}
