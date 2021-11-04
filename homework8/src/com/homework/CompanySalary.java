package com.homework;

public class CompanySalary {
    public static void main(String[] args) {
        Employee[] employee=new Employee[29];
        for(int i=0;i<employee.length;i++){
            if(i%3==0){
                employee[i] =new WeekWorker();
            }else if(i%3==1){
                employee[i]=new MonthWorker();
            }else if(i%3==2){
                employee[i]=new YearWorker();
            }
        }
        Company company=new Company(employee);
        System.out.println("公司薪水总额:"+company.salatiesPay()+"元");
    }
}
abstract class Employee{
    public abstract double earnings();
}
class YearWorker extends Employee{

    @Override
    public double earnings() {
        return 12000;
    }
}
class MonthWorker extends Employee{

    @Override
    public double earnings() {
        return 2300*12;
    }
}
class WeekWorker extends Employee{

    @Override
    public double earnings() {
        return 780*52;
    }
}
class Company{
    Employee[] employee;
    double salaries=0;
    Company(Employee[] employee){
        this.employee=employee;
    }
    public double salatiesPay(){
        salaries=0;
        for(int i=0;i<employee.length;i++){
            salaries=salaries+employee[i].earnings();
        }
        return salaries;
    }
}
