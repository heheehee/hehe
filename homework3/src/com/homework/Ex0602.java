package com.homework;

/**
 * // @PackageName:com.homework3
 * // @ClassName:Ex0602
 * // @Description:
 * // @author:作者
 * // @date:2021/9/29,16:16
 */
public class Ex0602 {
    public static void main(String[] args) {
        Pet pet1=new Pet();
        System.out.println("宠物的名称为:"+pet1.name);
        System.out.println("宠物的毛发颜色为:"+pet1.color);
        System.out.println("宠物的年龄为:"+pet1.age);
        System.out.println("宠物的售价为:"+pet1.price);
        System.out.println("宠物的数量为:"+Pet.count);
        Pet pet2=new Pet("小花","黑白",1,15,3000.0);
        System.out.println("宠物的名称为:"+pet2.name);
        System.out.println("宠物的毛发颜色为:"+pet2.color);
        System.out.println("宠物的年龄为:"+pet2.age);
        System.out.println("宠物的售价为:"+pet2.price);
        System.out.println("宠物的数量为:"+Pet.count);
    }
}
