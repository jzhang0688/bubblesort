package com.company;


public class BubbleSort {

    public static int[] bubbleSort(int[] Arr){
        for(int count = 0; count < Arr.length; count++) {
            for (int n = 0; n < Arr.length - 1; n++) {
                if (Arr[n] > Arr[n + 1]) {
                    SortingUtils.swap(Arr, n, n + 1);
                }
            }
        }
        return Arr;
    }



}
