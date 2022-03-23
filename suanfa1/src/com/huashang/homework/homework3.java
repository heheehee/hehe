package com.huashang.homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        String str = "";
        System.out.println("请输入一个字符串");
        Scanner input = new Scanner(System.in);
        str = input.next();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();// 将Str中的字符串倒置

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sb.charAt(i)) {
                count++;
            }
        }
        if (count == str.length()) {

            System.out.println("此字符串是一个回文字符串");
        } else {
            System.out.println("此字符串不是一个回文字符串");
        }
    }
}
