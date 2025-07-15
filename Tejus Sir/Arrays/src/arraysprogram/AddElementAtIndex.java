package arraysprogram;

import java.util.Arrays;

public class AddElementAtIndex {
	public static void main(String[] args) {
		int [] arr = {1,2,4,5,6};
		System.out.println("Main Array : "+Arrays.toString(arr));
		System.out.println("Ans Array : "+Arrays.toString(addEleAtIndex(arr,3,2)));
	}
	
	public static int[] addEleAtIndex(int[] arr, int ele, int index)
	{
		if (index >=0 && index <= arr.length ) {

		int[] ans =  new int[arr.length+1];
		for (int i = 0; i < ans.length; i++) {
			if (i<index) {
				ans[i] = arr[i];	
			}
			else if (i==index) {
				ans[i]=ele;	
			}
			else
			{
				ans[i]=arr[i-1];
			}
		}
		return ans;
		}
		else {
			System.out.println("Index "+index+" Not Found !");
			return null;
		}
	}	

}
