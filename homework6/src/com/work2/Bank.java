package com.work2;

public class Bank {
    int savedMoney;
    int year;
    double interest;
    double interesetRate=0.29;
    public double computerInterest(){
        interest=year*interesetRate*savedMoney;
        return interest;
    }
    public void setInteresetRate(double rate){
        interesetRate=rate;
    }
}
