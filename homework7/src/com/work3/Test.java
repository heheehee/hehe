package com.work3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎登录学院管理系统！");
        String name="admin";
        int password=123;
        for(int i=3;i>=0;i--){
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入用户名:");
            String loginName=scanner.next();
            System.out.println("请输入密码:");
            int loginPassword=scanner.nextInt();
            if(loginName.equals(name)&&loginPassword==password){
                searchSchool2();
                break;
            }else if(!loginName.equals(name)&&loginPassword==password){
                System.out.println("用户名错误!");
                System.out.println("你还有"+i+"次机会");
            }else{
                System.out.println("密码错误!");
                System.out.println("你还有"+i+"次机会");
            }
        }
    }
    public static void searchSchool2(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("登录成功！请选择你需要查询的信息");
        System.out.println("1.查询学生");
        System.out.println("2.查询专业");
        System.out.println("3.查询班级");
        System.out.println("4.查询学院");
        System.out.println("5.退出系统");
        int num= scanner.nextInt();
        switch(num){
            case 1:searchStudent();break;
            case 2:searchMajor();break;
            case 3:searchClass();break;
            case 4:
                schoolName();
                break;
            case 5:
                System.out.println("感谢使用，欢迎下次光临!");
                break;
            default:
                System.out.println("请输入正确的选项!");
                searchSchool();
                break;
        }
    }
    public static void searchSchool(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("查询完毕！请再次选择你需要查询的信息");
        System.out.println("1.查询学生");
        System.out.println("2.查询专业");
        System.out.println("3.查询班级");
        System.out.println("4.查询学院");
        System.out.println("5.退出系统");
        int num= scanner.nextInt();
        switch(num){
            case 1:searchStudent();break;
            case 2:searchMajor();break;
            case 3:searchClass();break;
            case 4:
                schoolName();
                break;
            case 5:
                System.out.println("感谢使用，欢迎下次光临!");
                break;
            default:
                System.out.println("请输入正确的选项!");
                searchSchool();
                break;
        }

    }
    //查询学院名称
    public static void schoolName(){
        School school=new School();
        System.out.println("学院名称:"+school.getSchoolName());
        searchSchool();
    }
    //查询学院专业
    public static void searchMajor(){
        School school1[]=new School[5];
        school1[0]=new School();
       school1[1]=new School("计算机科学与技术");
       school1[2]=new School("信息管理与信息系统");
       school1[3]=new School("数据科学与大数据技术");
       school1[4]=new School("电子商务");
       for(int i=0;i<school1.length;i++){
           System.out.println("专业名称:\t"+i+"."+school1[i].getMajorName());
       }
        searchSchool();
    }
    //查询学生
    public static void searchStudent(){
        School school=new School();
        Student student1[]=new Student[52];
        Student student2[]=new Student[51];
       for(int i=0;i< student1.length;i++){
           student1[i]=new Student("学生"+i,i,01010010+i);
       }
        for(int i=0;i< student2.length;i++){
            student2[i]=new Student("学生"+i,i,01045367+i);
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择你想要查询学生的班级:");
        System.out.println("1.软件工程1班");
        System.out.println("2.软件工程2班");
        int num=scanner.nextInt();
        if(num==1){
            for(int i=0;i<student1.length;i++){
                school.showStudent(student1[i]);
            }
        }else if(num==2){
            for(int i=0;i<student2.length;i++){
                school.showStudent(student2[i]);
            }
        }else{
            System.out.println("请输入正确的选项!");
            searchStudent();
        }
        searchSchool();
    }
    //查询班级
    public static void searchClass(){
        School school1=new School();
        SchoolClass sc1[]=new SchoolClass[2];
        SchoolClass sc2[]=new SchoolClass[3];
        SchoolClass sc3[]=new SchoolClass[2];
        SchoolClass sc4[]=new SchoolClass[3];
        SchoolClass sc5=new SchoolClass("信息管理与信息系统",49);
        sc1[0]=new SchoolClass();
       sc1[1]=new SchoolClass("软件工程2班",51);
       sc2[0]=new SchoolClass("计算机科学与技术1班",49);
        sc2[1]=new SchoolClass("计算机科学与技术2班",49);
        sc2[2]=new SchoolClass("计算机科学与技术3班",51);
        sc3[0]=new SchoolClass("数据科学与大数据技术1班",51);
        sc3[1]=new SchoolClass("数据科学与大数据技术2班",51);
        sc4[0]=new SchoolClass("电子商务1班",51);
        sc4[1]=new SchoolClass("电子商务2班",49);
        sc4[2]=new SchoolClass("电子商务3班",51);
        Scanner scanner=new Scanner(System.in);
        System.out.println("选择你要查询班级的专业:");
        System.out.println("1.软件工程");
        System.out.println("2.计算机科学与技术");
        System.out.println("3.数据科学与大数据技术");
        System.out.println("4.电子商务");
        System.out.println("5.信息管理与信息系统");
        int num=scanner.nextInt();
        if(num==1){
            for(int i=0;i<sc1.length;i++){
                school1.showSchoolClass(sc1[i]);
            }
        }else if(num==2){
            for(int i=0;i<sc2.length;i++){
                school1.showSchoolClass(sc2[i]);
            }
        }else if(num==3){
            for(int i=0;i<sc3.length;i++){
                school1.showSchoolClass(sc3[i]);
            }
        }else if(num==4){
            for(int i=0;i<sc4.length;i++){
                school1.showSchoolClass(sc4[i]);
            }
        }else if(num==5){
            school1.showSchoolClass(sc5);
        }else{
            System.out.println("请输入正确的选项!");
            searchClass();
        }
        searchSchool();
    }
}
