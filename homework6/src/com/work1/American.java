package com.work1;

public class American extends People{
    public void speakHello(){
        System.out.println("how do you do");
    }
    public void averageHeight(){
        height=176;
        System.out.println("美国人的平均身高是:"+height);
    }
    public void averageWeight(){
        weight=75;
        System.out.println("美国人的平均体重是:"+weight);
    }
    public void americanBoxing(){
        System.out.println("直拳、勾拳、组合拳");
    }
}
