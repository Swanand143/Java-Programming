package arraysprogram;

import java.util.Arrays;

public class ReverseArray {
	
	public static int[] revArray(int[] arr)
	{
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(revArray(arr)));
	}
}
