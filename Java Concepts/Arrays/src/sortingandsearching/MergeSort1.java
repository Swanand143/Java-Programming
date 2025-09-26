package sortingandsearching;

import java.util.Arrays;

public class MergeSort1 {
	public static void main(String[] args) {
		int[] arr1 = {5,15,18,20,55,60};
		int[] arr2 = {2,3,8,12,19,25,32,50,63};
		System.out.println("Array 1 : "+Arrays.toString(arr1));
		System.out.println("Array 2 : "+Arrays.toString(arr2));
		System.out.println("Ans : "+Arrays.toString(mergeSort1(arr1, arr2)));
	}
	public static int[] mergeSort1(int[] arr1,int[] arr2)
	{
		int[] ans = new int [arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				ans[k++] = arr1[i++];
			} else {
				ans[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			ans[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			ans[k++] = arr2[j++];
		}
		return ans;
	}

}
