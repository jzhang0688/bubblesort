package com.company;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        for(int n = 0; n < arr.length; n++)
        {
            if(arr[n] > arr[n+1])
            {
                swap(arr, n, n+1);
                n = -1;
            }
        }
        return arr;
    }


    public static void swap(int[]testArr,int x,int y){
        int temp;
        temp = testArr[x];
        testArr[x]=testArr[y];
        testArr[y]=temp;
    }
}
