package com.homework2;


/*
 * @author xiangjiaxin
 * @date 2022/3/23 2:35 PM*/
public class h4 {//快速排序问题

    public static void main(String[] args) {
        int[] array = {545, 654, 2, -11, 24, 745, 58, 35, 64, 75, 253, 35};
        quickSorted(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }

    private static void quickSorted(int[] array, int start, int end) {
        if (start < end) {
            int loc = lookForLocation(array, start, end);
            //类似二分法，递归分治的思想，靶子左边和右边的分别继续递归排序
            quickSorted(array, start, loc - 1);
            quickSorted(array, loc + 1, end);
        }
    }

    private static int lookForLocation(int[] array, int start, int end) {
        int i = start, j = end;
        int temp = array[start];
        while (i < j) {
            while (array[j] >= temp && i < j) {
                j--;
            }
            array[i] = array[j];
            while (array[i] <= temp && i < j) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = temp;
        return i;
    }

}
