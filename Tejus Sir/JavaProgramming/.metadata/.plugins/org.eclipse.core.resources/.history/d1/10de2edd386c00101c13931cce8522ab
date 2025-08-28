package multidimensionalarray;

import java.util.Iterator;

public class SumOfDiagonalEleOf2DArray {
	public static void main(String[] args) {
		
		int [][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		      };
		System.out.println("Sum Of Diagonal Elements : "+ sumOfDiagonalEleOf2DArray(a));
	}
	
	public static int sumOfDiagonalEleOf2DArray(int[][]a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j) {
					sum = sum + a[i][j];
				}
			}
		}
		return sum;
	}
	

}
