package arraysprogram;

import java.util.Arrays;

public class ZigZagArray {
	
	public static void main(String[] args) {
		int[] arr1 = {1,1,1};
		int[] arr2 = {2,2,2,2,2,2} ;
		System.out.println("Array 1 = "+Arrays.toString(arr1));
		System.out.println("Array 2 = "+Arrays.toString(arr2));
		System.out.println("Merged Array = "+Arrays.toString(zigZag(arr1, arr2)));
	}
	
	public static int[] zigZag(int[] arr1, int[] arr2) {
	    int[] ans = new int[arr1.length + arr2.length];
	    int count = 0;
	    for (int i = 0; i < (arr1.length>arr2.length ? arr1.length : arr2.length); i++) {
	    	if (i<arr1.length) {
	    		ans[count] = arr1[i];
	    		count++;	
			}
	    	if (i<arr2.length) {
	    		ans[count] = arr2[i];
	    		count++;	
			}
		}
	    return ans;
	}
	//logic2
//	public static int[] zigZag(int[] arr1, int[] arr2) {
//	    int[] ans = new int[arr1.length + arr2.length];
//	    for (int i = 0, j = 0, k = 0; i < ans.length; i++) {
//			if (i%2==0 && j<arr1.length) {
//				ans[i] = arr1[j++];
//			}else if(k<arr2.length) {
//				ans[i] = arr2[k++];
//			}else if(j<arr1.length){
//				ans[i] = arr1[j];
//			}
//		}
//	    return ans;
//	}
	
}
