package arraysprogram;

import java.util.Arrays;

public class HalfReverseArray {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};  
		System.out.println(Arrays.toString(arr));
		System.out.println("Half Reverse : "+Arrays.toString(halfRevArray(arr)));
	}
	
	public static int[] halfRevArray(int[] arr) {
		
		for (int i = arr.length/2,j = arr.length-1; i <= j; i++,j--) {
			int temp = arr[i];
			arr[i] = arr [j];
			arr[j] = temp;
		}
		return arr;
	}
}
