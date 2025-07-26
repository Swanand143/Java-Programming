 package arraysprogram;

import java.util.Arrays;

public class MaxElement {
	
	public static void main(String[] args) {
		int[] arr = {2,-1,7,5,6,3};
		System.out.println("Max Element = "+max(arr));
		System.out.println("Second Max Element = "+secMax(arr));
		System.out.println("Third Max Element = "+thirMax(arr));
	}
	//max element
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE; //-2147483648
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max ; 
	}
	//Second max element
	public static int secMax(int[] arr) {
		int max = Integer.MIN_VALUE; //-2147483648
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secMax = max ;
				max = arr[i];
			}
			else if (arr[i]>secMax && arr[i]!=max) { //&& arr[i]!=max when we not want max = secMax
				secMax = arr[i];
			}
		}
		return secMax ; 
	}
	//Third Max Element
	public static int thirMax(int[] arr) {
		int max = Integer.MIN_VALUE; //-2147483648
		int secMax = Integer.MIN_VALUE;
		int thirMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				thirMax = secMax;
				secMax = max ;
				max = arr[i];
			}
			else if (arr[i]>secMax && max != arr[i]) { 
				thirMax = secMax;
				secMax = arr[i];
			}
			else if(arr[i]>thirMax && (max != arr[i] && secMax != arr[i] )) {
				thirMax = arr[i];
			}
		}
		return thirMax ; 
	}
}
