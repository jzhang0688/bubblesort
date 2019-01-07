package com.company;

public class SortingUtils {
    public static void swap(int[] testArr, int x, int y) {
        int temp;
        temp = testArr[x];
        testArr[x] = testArr[y];
        testArr[y] = temp;
    }

    public static boolean isSorted(int[] Arr) {
        for (int count = 0; count < Arr.length; count++) {
            for (int n = 0; n < Arr.length - 1; n++) {
                if (Arr[n] > Arr[n + 1]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after){
         int sumbefore = 0;
         int sumafter = 0;
         for(int i = 0; i < before.length - 1; i++)
         {
             sumbefore = sumbefore+before[i];
         }
         for(int x = 0; x < after.length - 1; x++)
         {
             sumafter = sumafter + after[x];
         }

         if (sumafter != sumbefore)
         {
             return false;
         }
         return true;

    }
}
