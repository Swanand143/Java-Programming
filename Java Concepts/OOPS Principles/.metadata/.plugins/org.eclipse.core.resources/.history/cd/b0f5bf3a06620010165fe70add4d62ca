package arraysprogram;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1,5,6,3};
		System.out.println("Main Array : "+Arrays.toString(arr));
		System.out.println("Ans Array : "+Arrays.toString(removeDuplicates(arr)));	
	}
	
	public static int[] frequency(int[] arr)
	{
		int count[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int ct = 0;
			if (count[i] != -1) {
				for (int j = i+1; j < count.length; j++) {
					if (arr[i] == arr[j]) {
						ct ++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
		}
		return count;
	}
	
	public static int[] removeDuplicates(int[]arr)
	{
		int[] freq = frequency(arr);
		int negCount = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]==-1) {
				negCount ++;
			}
		}
		int[] ans = new int[arr.length-negCount];
		for (int i = 0,j = 0; i < arr.length; i++) {
			if (freq[i]!=-1) {
				ans[j] = arr[i];
				j++;
			}
		}
		return ans;
	}

}
