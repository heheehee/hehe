package com.homework2;

public class DangerException extends Throwable {
    String message;
    public DangerException(){
        message="危险品";
    }
    public void toShow(){
        System.out.print(message+" ");
    }
}
