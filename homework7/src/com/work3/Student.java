package com.work3;

public class Student {
    private String StudentName;
    private int StudentNo;
    private long telephone;

    public Student(String studentName, int studentNo, long telephone) {
        StudentName = studentName;
        StudentNo = studentNo;
        this.telephone = telephone;
    }

    public Student(){
        StudentName="呵呵";
        StudentNo=35;
        this.telephone=122344555;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public void setStudentNo(int studentNo) {
        StudentNo = studentNo;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
}
