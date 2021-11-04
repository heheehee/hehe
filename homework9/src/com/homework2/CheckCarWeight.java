package com.homework2;

public class CheckCarWeight {
    public static void main(String[] args) {
        ComputerWeight[] goods=new ComputerWeight[650];
        for(int i=0;i<goods.length;i++){
            if(i%3==0){
                goods[i]=new Television();
            }else if(i%3==1){
                goods[i]=new Computer();
            }else{
                goods[i]=new WashMachine();
            }
        }
        Truck truck=new Truck(goods);
        truck.setGoods(goods);
        System.out.printf("货车装载的货物重量:%.2f\n",truck.getTotalWeight());
        goods=new ComputerWeight[68];
        for(int i=0;i< goods.length;i++){
            if(i%2==0){
                goods[i]=new Television();
            }else{
                goods[i]=new WashMachine();
            }
        }
        truck.setGoods(goods);
        System.out.println("货车装载的货物重量:"+truck.getTotalWeight());
    }
}
interface ComputerWeight{
    public double computerWeight();
}
class Television implements ComputerWeight{

    @Override
    public double computerWeight() {
        double num=3.5;
        return num;
    }
}
class Computer implements ComputerWeight{

    @Override
    public double computerWeight() {
        double num=2.67;
        return num;
    }
}
class WashMachine implements ComputerWeight{

    @Override
    public double computerWeight() {
        double num=13.8;
        return num;
    }
}
class Truck{
    ComputerWeight[] goods;
    double totalWeight=0;
    Truck(ComputerWeight[] goods){
        this.goods=goods;
    }

    public void setGoods(ComputerWeight[] goods) {
        this.goods = goods;
    }

    public double getTotalWeight() {
        totalWeight=0;
        for(int i=0;i<goods.length;i++){
            totalWeight=totalWeight+goods[i].computerWeight();
        }
        return totalWeight;
    }
}


