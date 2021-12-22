package com.homework1;

public class Division {
    int dividend;
    int divisor;

    public Division(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }
    public Division() {
        this.dividend =1;
        this.divisor = 1;
    }

    public int getDividend() {
        return dividend;
    }

    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        if(divisor==0){
            System.out.println("除数不能为零");
        }else{
            this.divisor = divisor;
        }
    }
}
