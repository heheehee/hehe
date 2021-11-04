package com.homework;

public class Village {
    static int waterAmount;
    int peopleNumber;
    String name;
    Village(String name){
        this.name=name;
    }

    static void setWaterAmount(int m){
        if(m>0){
            waterAmount=m;
        } else{
            System.out.println("请输入正确的水量");
        }
    }
    void drinkWater(int n){
        if(waterAmount-n>=0){
            waterAmount=waterAmount-n;
        }else {
            waterAmount=0;
        }
    }

    static int lookWaterAmount(){
        return waterAmount;
    }

    void setPeopleNumber(int n){
        peopleNumber=n;
    }
    int getPeopleNumber(){
        return peopleNumber;
    }
}

