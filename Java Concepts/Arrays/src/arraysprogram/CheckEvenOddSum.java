package arraysprogram;

import java.util.Arrays;

public class CheckEvenOddSum {
	
    public static void main(String[] args) {
		
		int [] arr = {2,4,1,5};
		System.out.println(Arrays.toString(arr));
		evenOddSum(arr);
	}
	
	public static void evenOddSum(int[] arr)
	{
		int evenSum = 0,oddSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int ans = (arr[i]%2 == 0)?(evenSum = evenSum + arr[i]):(oddSum = oddSum + arr[i]);
			
		}
		System.out.println("Even Sum = "+evenSum);
		System.out.println("Odd Sum = "+oddSum);
		System.out.println(evenSum == oddSum?"Even and odd sum are equal":"Even and odd sum are not equal");
	}
	
	//Two Pointer approach
//	public static boolean evenOddSum(int[] arr) {
//		int i = 0, j = ref.length-1, evenSum = 0, oddSum = 0;
//		while(i < j || i == j) {
//			if (ref[i] % 2 == 0) {
//				evenSum += ref[i];
//			}
//			else {
//				oddSum += ref[i];
//			}
//			
//			if (i != j) {
//				if(ref[j] % 2 == 0) {
//					evenSum += ref[j];
//				}
//				else {
//					oddSum += ref[j];
//				}
//			}
//			
//			i++;
//			j--;
//		}
//		System.out.println("Sum Of Even Elements : " + evenSum);
//		System.out.println("Sum Of Odd Elements : " + oddSum);
//		return evenSum == oddSum;
//	}


}
