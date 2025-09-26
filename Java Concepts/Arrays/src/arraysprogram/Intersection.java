package arraysprogram;

import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
		int[] ar1 = {1,2,3,4,5,1,7,8};
		int[] ar2 = {1,2,3,4,5,6,1,2};
		
		System.out.println
		("MAIN ARRAYS : \n" + "ARRAY 1 : " + Arrays.toString(ar1) + 
				"\n" + "ARRAY 2 : " + Arrays.toString(ar2));
		
		System.out.println
		("\nINTERSECTION ARRAY1 & ARRAY2 : \n " + 
		Arrays.toString(RemoveDuplicates.removeDuplicates
				(intersectionOf(RemoveDuplicates.removeDuplicates(ar1), 
						        RemoveDuplicates.removeDuplicates(ar2)))));
	}
	
// METHODS
//	Using Count Array putting true if ele found
	public static int[] intersectionOf(int[] ref1, int[] ref2) {
		boolean[] count1 = new boolean[ref1.length];
		
		int cnt = 0;
		for (int i = 0; i < ref2.length; i++) {
			for (int j = 0; j < ref1.length; j++) {
				if (ref2[i] == ref1[j]) {
					cnt++;
					count1[j] = true; // true means ele is foud so put true to that respective position of ele
				}
			}
		}
		
		if (cnt > 0) {
			int[] ans = new int[cnt];
			for (int i = 0, j = 0; i < count1.length; i++) {
				if (count1[i] == true) {
					ans[j++] = ref1[i];
				}
			}
			return ans;
		}
		return ref1;
	}

}
