package com.homework2;

/*
 * @author xiangjiaxin
 * @date 2022/3/22 6:11 PM*/
public class h1 {//二分搜索问题
    public static void main(String[] args) {
        int[] arr=new int[] {1,3,6,8,9,12,16,19,21};
        int res1=binarySearch(arr,9,arr.length);
        System.out.println("结果为"+res1);
    }
    public static int binarySearch(int[] a,int x,int n) {
        int left=0;
        int right=n-1;
        while(left<=right) {
            int middle=(left+right)/2;
            if(x==a[middle]) {
                return middle;
            }
            if(x>a[middle]) {
                left=middle=1;
            }else {
                right=middle-1;
            }
        }
        return -1;
    }
}
