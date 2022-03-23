package com.homework2;

/*
 * @author xiangjiaxin
 * @date 2022/3/23 2:15 PM*/
public class h3 {//最大子数组问题

    public static void main(String[] args) {
        int[] input=new int[]{1,-3,4,-2,8,3,9,-5,10,-1,7};
        int max=maxContinuousSubarrayDP(input,input.length);
        System.out.println("最大值为:"+max);
    }
    public static int maxContinuousSubarrayDP(int[] x,int n){
        int[] d=new int[n];
        int[] rec=new int[n];
        d[n-1]=x[n-1];
        rec[n-1]=n-1;
        for(int i=n-2;i>=0;i--){
            if(d[i+1]>0){
                d[i]=x[i]+d[i+1];
                rec[i]=rec[i+1];
            }else{
                d[i]=x[i];
                rec[i]=i;
            }
        }
        int sMax=d[0];
        for(int i=1;i<n;i++){
            if(sMax<d[i]){
                sMax=d[i];
            }
        }
        return sMax;
    }
}
