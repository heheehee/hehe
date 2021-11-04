package com.homework;

public class PC {
        CPU cpu;
        HardDisk hardDisk;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    void show(){
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("硬盘容量:"+hardDisk.getAmount());
    }
}
