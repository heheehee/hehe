package com.homework2;

public class Machine {
    public void checkBag(Goods goods) throws DangerException{
        if (goods.isDanger()) {
            DangerException dangerException=new DangerException();
            throw dangerException;
        }else{
            System.out.println(goods.getName()+"不是危险品!");
        }
    }
}
