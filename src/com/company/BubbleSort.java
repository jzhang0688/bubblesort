package com.company;

public class BubbleSort {

    public static int[] bubbleSort(int[] testArr){
        for(int count = 0; count < testArr.length; count++) {
            for (int n = 0; n < testArr.length - 1; n++) {
                if (testArr[n] > testArr[n + 1]) {
                    swap(testArr, n, n + 1);
                }
            }
        }
        return testArr;
    }


    public static void swap(int[]testArr,int x,int y){
        int temp;
        temp = testArr[x];
        testArr[x]=testArr[y];
        testArr[y]=temp;
    }
}
