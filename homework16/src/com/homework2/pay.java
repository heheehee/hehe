package com.homework2;

public class pay {
    public static void main(String[] args) {
        String market="所有的超市都支持";
        String payStyle="现金付款";
        String supermarket="但是大型商超还支持";
        String marketStyle="刷卡付款";
        pay(market,payStyle);
        pay(supermarket,marketStyle);
    }
    public static void pay(String s,String d){
        System.out.println(s+d);
    }
}
