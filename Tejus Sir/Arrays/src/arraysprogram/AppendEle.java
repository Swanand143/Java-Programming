package arraysprogram;

import java.util.Arrays;

public class AppendEle {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		System.out.println("Main Array : "+Arrays.toString(arr));
		System.out.println("Ans Array : "+Arrays.toString(addEleLast(arr, 6)));
	}
	
	public static int[] addEleLast(int[] arr, int ele)
	{
		int[] ans =  new int[arr.length+1];
		for (int i = 0; i < ans.length; i++) {
			if (i<arr.length) {
				ans[i] = arr[i];	
			}
			else if (i==arr.length) {
				ans[i]=ele;	
			}	
		}
		return ans;
	}
}
