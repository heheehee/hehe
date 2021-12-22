package com.homework1;

public class Demo {
    public static void main(String[] args) {
        Division division=new Division();
        division.setDividend(9);
        division.setDivisor(0);
        division.setDividend(100);
        division.setDivisor(10);
        double num=division.getDividend()/division.getDivisor();
        System.out.println(num);
    }

}
