package com.work3;

public class SchoolClass {
    private  String ClassName;
    private int StudentNum;

    public SchoolClass(String className, int studentNum) {
        ClassName = className;
        StudentNum = studentNum;
    }
    public SchoolClass(){
        ClassName="软件工程1班";
        StudentNum=52;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(int studentNum) {
        StudentNum = studentNum;
    }
}
