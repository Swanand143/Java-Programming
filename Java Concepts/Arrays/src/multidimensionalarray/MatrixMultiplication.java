package multidimensionalarray;

import java.util.Arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int [][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int [][]b = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		try {
			int [][] mul = multiply(a, b);
			System.out.println("Ans : ");
			for (int i = 0; i < mul.length; i++) {
				System.out.println(Arrays.toString(mul[i]));
			}
		} catch (NullPointerException e) {
			System.out.println("Arrays not symmetric ");
			System.out.println("Only symmetric arrays allowed");
		}
	}
	public static int[][] multiply(int[][]a,int[][]b){
		
		if (isSymmetric(a, b)&&a[0].length==b.length) {
			int [][] c= new int [a.length][b[0].length];
			
			  for (int i = 0; i < a.length; i++) { 
		            for (int j = 0; j < b[0].length; j++) {
		                   for (int k = 0; k < c.length; k++) {
		                	   c[i][j] += a[i][k] * b[k][j];
						}                                                                                 
		            }
		        }
			return c;
		}
		return null;
	}
	
	public static boolean isSymmetric(int[][]a,int[][]b) {
		boolean check1 = true , check2 = true;
		
		for (int i = 0; i < a.length; i++) {
			if (a[0].length!=a[i].length) {
				check1 = false;
				return false;
				
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[0].length!=b[i].length) {
				check2 = false;
				return false;
				
			}
		}
		return check1 && check2;
	}	
}