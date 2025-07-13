package arraysprogram;

import java.util.Arrays;

public class BothReverseArry {
	
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {60,70,80,90,100};
		System.out.println("Array 1 = "+Arrays.toString(arr1));
		System.out.println("Array 2 = "+Arrays.toString(arr2));
		System.out.println("Merged Array = "+Arrays.toString(mergeArray(arr1, arr2)));
	}
	public static int[] mergeArray(int[] arr1, int[] arr2) {
	    int[] ans = new int[arr1.length + arr2.length];
	    for (int i = 0, j = arr2.length-1; i < ans.length; i++) {
	    	if (i<arr1.length) {
				ans[i] = arr1[arr1.length-1-i];
	    	}
	    	else {
	    		ans[i] =arr2[j--];
	    	}
	    }
	    return ans;
	}
}
