package arraysprogram;

import java.util.Arrays;

public class ReturnOccuranceOfSpeciEle {
public static void main(String[] args) {
		
		int[] arr  = {10,20,10,30,10,40,50};
		System.out.println("Main Array : "+Arrays.toString(arr));
		System.out.println("Ans Array : "+Arrays.toString(returnOccurance(arr,10)));
	}
	public static int getCount(int[] arr, int ele)
	{
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ele) {
				cnt ++;
			}
		}
		return cnt;
	}
	public static int[] returnOccurance(int[] arr, int ele)
	{
		int cnt = getCount(arr, ele);
		if (cnt>0) {
			int[] ans  = new int[arr.length - getCount(arr, ele)];
			for (int i = 0, j = 0; i < arr.length; i++) {
				if (arr[i]==ele) {
					ans[j++] = arr[i];
				}
			}
			return ans;
		}
		else {
			System.out.println("Element Not Found!");
			return null;
		}	
	}

}
