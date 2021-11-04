package com.work3;

public class School {
    private String MajorName;
    private String schoolName;

    public void showStudent(Student student){
        System.out.println("学生学号:"+student.getStudentNo()+"\t"+
                "学生姓名:"+student.getStudentName()+"\t"+"学生电话:"+student.getTelephone());
    }
    public void showSchoolClass(SchoolClass schoolClass){
        System.out.println("班级名称:"+schoolClass.getClassName()+"\t"+
                "学生人数:"+schoolClass.getStudentNum());
    }

    public School(String majorName) {
        MajorName = majorName;
    }

    public School() {
        this.MajorName="软件工程";
        this.schoolName="数据科学学院";
    }

    public String getMajorName() {
        return MajorName;
    }

    public void setMajorName(String majorName) {
        MajorName = majorName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
