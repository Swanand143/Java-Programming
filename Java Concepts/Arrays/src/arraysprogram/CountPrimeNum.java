package arraysprogram;

import java.util.Arrays;

public class CountPrimeNum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println(countOfPrime(arr));	
	}
	
	public static int countOfPrime(int[] arr)
	{
		int count = 0, din=2;
		for (int i = 0; i < arr.length; i++) {
			while(din < arr[i]) {
				if (arr[i]%2 == 0) {
					break;
				}
				din++;
			}
			if (din == arr[i]) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.print("Count = ");
		return count;
	}
}
