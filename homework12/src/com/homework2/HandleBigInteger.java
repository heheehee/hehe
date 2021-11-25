package com.homework2;
import java.math.BigInteger;
public class HandleBigInteger {
    public static void main(String[] args) {
        BigInteger bigInteger1=new BigInteger("987654321987654321987654321");
        BigInteger bigInteger2=new BigInteger("123456789123456789123456789");
        BigInteger result=null;
        result=bigInteger1.add(bigInteger2);
        System.out.println("和:"+result.toString());
        result=bigInteger1.subtract(bigInteger2);
        System.out.println("差:"+result.toString());
        result=bigInteger1.multiply(bigInteger2);
        System.out.println("乘积:"+result.toString());
        result=bigInteger1.divide(bigInteger2);
        System.out.println("商:"+result.toString());
        BigInteger m=new BigInteger("1968957");
        BigInteger COUNT=new BigInteger("0");
        BigInteger ONE=new BigInteger("1");
        BigInteger TWO=new BigInteger("2");
        System.out.println(m.toString());
        for(BigInteger i=TWO;i.compareTo(m)<0;i=i.add(ONE)){
            if((bigInteger1.remainder(i).compareTo(BigInteger.ZERO))==0) {
                COUNT = COUNT.add(ONE);
                System.out.print("  " + i.toString());
            }
        }
        System.out.println("");
        System.out.println(m.toString()+"一共有"+COUNT.toString()+"个因子");
    }
}
