package multidimensionalarray;

import java.util.Iterator;

public class SumOfEleOf2DArray {
	public static void main(String[] args) {
		int [][] ar  = {
				{1,2,3},	
				{4,5,6},	
				{7,8,9}	
		};
		System.out.println("Sum of elements : "+sumOfEleOf2dArray(ar));
	}
	
	public static int sumOfEleOf2dArray(int ar[][])
	{
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				sum = sum + ar[i][j];
			}
		}
		return sum;
	}
}
