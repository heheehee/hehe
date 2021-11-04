package com.work1;

public class Chinese extends People{
    public void speakHello(){
        System.out.println("你好呀！");
    }
    public void averageHeight(){
        height=168.78;
        System.out.println("中国人的平均身高是:"+height);
    }
    public void averageWeight(){
        weight=65;
        System.out.println("中国人的平均体重是:"+weight);
    }
    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }
}
