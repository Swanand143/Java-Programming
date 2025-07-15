package arraysprogram;

import java.util.Arrays;

public class AddArrayAtindex {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,7,8};
		int[] arr2 = {4,5,6};
		System.out.println("Array 1 : "+Arrays.toString(arr1));
		System.out.println("Array 2 : "+Arrays.toString(arr2));
		System.out.println("Ans Array : "+Arrays.toString(addArrayAtindex(arr1,arr2,3)));
	}
	public static int[] addArrayAtindex(int[] arr1, int[] arr2, int index)
	{
		if (index >= 0 && index <= arr1.length) {
		
		int[] ans = new int[arr1.length + arr2.length];
		for (int i = 0, j = 0; i < ans.length; i++) {
			if (i<index) {
				ans[i] = arr1[i];
			}
			else if (i >= index && j < arr2.length) {
				ans[i] = arr2[j];
				j++;
			}
			else {
				ans[i] = arr1[i-arr2.length];
			}	
		}
		return ans;
		}
		else {
			System.out.println("Index " + index + " Not Found !");
			return null;
		}
	}

}
