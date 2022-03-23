package com.huashang.homework;

import java.util.Arrays;

public class homework1 {
    public static void main(String[] args) {
        perm(new int[]{1,2,3},0,2);
    }
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
    public static void perm(int[] array,int start,int end){
        if(start==end){
            System.out.println(Arrays.toString(array));
        }else{
            for(int i=start;i<=end;i++){
                swap(array,start,i);
                perm(array,start+1,end);
                swap(array,start,i);
            }
        }
    }

}
