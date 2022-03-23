package com.homework2;

/*
 * @author xiangjiaxin
 * @date 2022/3/23 3:09 PM*/
public class h5 {//次序选择问题
    public static void main(String[] args) {
        int[] arr=new int[]{4,1,7,5,2,6,9,12,11,3};
        toSelection(arr,0,arr.length-1,3);
    }
    public static void toSelection(int[] arr,int left,int right,int k){
        int principalElmment=left+(int)(Math.random()*(right-left+1));
        int temp=arr[principalElmment];
        arr[principalElmment]=arr[right];
        arr[right]=temp;
        int i=left-1;
        for(int j=left;j<right;j++){
            if(arr[j]<arr[right]){
                ++i;
                int temp1=arr[j];
                arr[j]=arr[i];
                arr[i]=temp1;
            }
        }
        int temp2=arr[right];
        arr[right]=arr[i+1];
        arr[i+1]=temp2;

        if(k==i+1){
            System.out.println("第"+(k+1)+"小数为:"+arr[k]);
        }
        if(k<i+1){
            toSelection(arr,left,i,k);
        }
        if(k>i+1){
            toSelection(arr,i+2,right,k);
        }
    }
}
