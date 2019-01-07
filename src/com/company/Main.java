package com.company;

public class Main {

	public static void main(String[] args) {
		int[] testArr = {8, 6, 7, 5, 3, 0, 9, 10, 1, 2, 3};
		System.out.print("Before: ");
		for (int num : testArr)
			System.out.print(num + " ");
		System.out.println();
		int [] before = testArr;

		BubbleSort.bubbleSort(testArr);
		System.out.print("After: ");
		for (int num : testArr) {
			System.out.print(num + " ");
			System.out.println();
		}
		int [] after = testArr;
		System.out.println(SortingUtils.checkSum(before, after));
		System.out.println(SortingUtils.isSorted(before));

	}
}
