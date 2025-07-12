package arraysprogram;

import java.util.Arrays;

public class CountEvenOdd {
	
    public static void main(String[] args) {
		
		int [] arr = {2,4,1,5,7};
		System.out.println(Arrays.toString(arr));
		countEvenOdd(arr);
	}
    
    public static void countEvenOdd(int[] arr)
	{
		int evenCount = 0, oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int ans = (arr[i]%2 == 0)?(evenCount++):(oddCount++);
			
		}
		System.out.println("Count Of Even Elements = "+evenCount);
		System.out.println("Count Of Odd Elements = "+oddCount);
		System.out.println(evenCount == oddCount?"Count of Even and odd elements are equal":"Count of Even and odd elements are not equal");
	}

}
