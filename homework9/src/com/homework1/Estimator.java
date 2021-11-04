package com.homework1;

public class Estimator {
    public static void main(String[] args) {
        double a[]={9.89,9.88,9.99,9.12,9.69,9.76,8.97};
        double b[]={89,56,78,90,100,77,56,45,36,79,98};
        ComputerAverage computer;
        computer=new Gymnastics();
        double result=computer.average(a);
        System.out.printf("体操选手的最后得分是:%5.3f\n",result);
        computer=new School();
        result=computer.average(b);
        System.out.printf("班级考试的平均分数是:%-5.2f",result);
    }
}
interface ComputerAverage{
    public double average(double x[]);
}
class Gymnastics implements ComputerAverage{

    @Override
    public double average(double[] x) {
        int count=x.length;
        double aver=0,temp=0;
        for(int i=0;i<count;i++){
            for(int j=0;j<count;j++){
                if(x[j]<x[i]){
                    temp=x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        for(int i=1;i<count-1;i++){
            aver=aver+x[i];
        }
        if(count>2){
            aver=aver/(count-2);
        }else{
            aver=0;
        }
        return aver;
    }
}
class School implements ComputerAverage{

    @Override
    public double average(double[] x) {
        int num=x.length;
        double sum=0;
        double average=0;
        for(int i=0;i<x.length;i++){
            sum=sum+x[i];
        }
        average=sum/num;
        return average;
    }
}
