package com.homework;

/**
 * // @PackageName:com.homework3
 * // @ClassName:Ex601
 * // @Description:
 * // @author:作者
 * // @date:2021/9/29,16:11
 */
public class Ex0601 {
    public static void main(String[] args) {
        Pet pet1=new Pet();
        System.out.println("宠物的名称为:"+pet1.name);
        System.out.println("宠物的毛发颜色为:"+pet1.color);
        System.out.println("宠物的年龄为:"+pet1.age);
        System.out.println("宠物的售价为:"+pet1.price);
       pet1.addPrice(300);
        System.out.println("宠物的名称为:"+pet1.name);
        System.out.println("宠物的毛发颜色为:"+pet1.color);
        System.out.println("宠物的年龄为:"+pet1.age);
        System.out.println("宠物的售价为:"+pet1.price);
    }
}
