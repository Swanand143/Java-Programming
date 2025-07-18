package arraysprogram;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveEleOf2ArrayFrom1Array {

	public static void main(String[] args) {
		 int [] arr1 = {1,2,3,4,5};
		 int [] arr2 = {2,4,6,8};
		 System.out.println("Array 1 : "+Arrays.toString(arr1));
		 System.out.println("Array 2 : "+Arrays.toString(arr2));
		 System.out.println("Ans : "+Arrays.toString(removeEle(arr1, arr2)) );
	}
	public static int[] removeEle(int[]arr1, int[]arr2)
	{
		boolean [] occ = new boolean[arr1.length];
		int ct = 0;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] == arr1[j]) {
					ct ++;
					occ[j] = true;
				}
			}
		}
		if (ct>0) {
			int[] ans = new int[arr1.length-ct];
			for (int i = 0,j = 0; i < arr1.length; i++) {
				if (occ[i]!=true) {
					ans[j]=arr1[i];
					j++;
				}
			}
			return ans;
		}
		return arr1;
	}
}
