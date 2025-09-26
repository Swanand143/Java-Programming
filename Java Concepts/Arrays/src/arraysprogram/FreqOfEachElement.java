package arraysprogram;

import java.util.Arrays;
import java.util.Iterator;

public class FreqOfEachElement {
	
	public static void main(String[] args) {
		int [] arr = {10,-3,6,4,-3,10,4,8,6,4,6};
		System.out.println("Main Array : "+Arrays.toString(arr));
		freqOfEle(arr);
	}
	public static void freqOfEle(int[] arr)
	{
		int[] count = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int ct = 0;
			if (count[i]!=-1) {
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						ct ++;
						count[j] =-1;
					}
				}
				count[i] = ct;
			}	
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i]!=-1) {
				System.out.println(arr[i]+" is repeated "+count[i]+" times");
			}
		}
	}

}
