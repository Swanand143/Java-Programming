package arraysprogram;

import java.util.Arrays;

public class ReverseArray2 {
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50};
		System.out.println("Ans : "+Arrays.toString(rev(arr)));
	}
	public static int[] rev(int[] arr)
	{
		int[] temp = new int[arr.length];
		for (int i = arr.length-1,j=0; i >= 0; i--) {
			temp[j] = arr[i];
			j++;
		}
		return temp;
	}
}
