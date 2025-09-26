package sortingandsearching;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {100,20,3,1,-8};
		System.out.println("Main Array : "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Ans Array : "+Arrays.toString(arr));
	}
	public static void bubbleSort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp ;
				}
			}
		}
	}
}
