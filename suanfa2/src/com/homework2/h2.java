package com.homework2;

/*
 * @author xiangjiaxin
 * @date 2022/3/23 1:58 PM*/
public class h2 {//归并排序
    public static void main(String[] args) {
        int[] nums=new int[]{9,3,5,1,6,7,20,4,8};
        int[] newNum=mergeSort(nums,0,nums.length-1);
        for(int x:newNum){
            System.out.print(x+" ");
        }
    }
    public static int[] mergeSort(int[] nums,int l,int h){
        if(l==h){
            return new int[]{nums[l]};
        }
        int mid=l+(h-l)/2;
        int[] leftArr=mergeSort(nums,l,mid); //左有序数组
        int[] rightArr=mergeSort(nums,mid+1,h); //右有序数组
        int[] newNum=new int[leftArr.length+rightArr.length]; //新有序数组

        int m=0,i=0,j=0;
        while(i< leftArr.length&&j< rightArr.length){
            newNum[m++]=leftArr[i]<rightArr[j]?leftArr[i++] : rightArr[j++];
        }
        while (i< leftArr.length){
            newNum[m++]=leftArr[i++];
        }
        while(j< rightArr.length){
            newNum[m++]=rightArr[j++];
        }
        return newNum;

    }
}
