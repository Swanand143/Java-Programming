package arraysprogram;

import java.util.Arrays;

public class RemoveIndex {
	public static void main(String[] args) {
		int [] arr = {1,2,3,6,4,5};
		System.out.println("Main Array : "+Arrays.toString(arr));
		System.out.println("Ans Array : "+Arrays.toString(removeIndex(arr,3)));
	}
	
	public static int[] removeIndex(int[] arr, int index)
	{
		int[] ans =  new int[arr.length-1];
		for (int i = 0; i < ans.length; i++) {
			if (i<index) {
				ans[i] = arr[i];	
			}
			else if (i==index) {
				ans[i] = arr[i+1];	
			}
			else
			{
				ans[i] = arr[i+1];
			}
			
		}
		return ans;
	}	
}
