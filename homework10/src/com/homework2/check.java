package com.homework2;

public class check {
    public static void main(String[] args) {
        Machine machine=new Machine();
        String name[]={"苹果","炸药","西服","硫酸","手表","硫磺"};
        Goods[] goods=new Goods[name.length];
        for(int i=0;i<name.length;i++){
            goods[i]=new Goods();
            if(i%2==0){
                goods[i].SetIsDanger(false);
                goods[i].setName(name[i]);
            }else{
                goods[i].SetIsDanger(true);
                goods[i].setName(name[i]);
            }
        }
        for(int i=0;i< goods.length;i++){
            try {
                machine.checkBag(goods[i]);
                System.out.println(goods[i].getName()+"检查通过");
            }catch (DangerException e){
                e.toShow();
                System.out.println(goods[i].getName()+"被禁止!");
            }
        }
    }
}
