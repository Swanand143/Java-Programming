package multidimensionalarray;

import java.util.Arrays;
import java.util.Iterator;

public class TransposeMatrix {
	
	public static void main(String[] args) {
		
		char [][] ar = {
				{'a','b','c','d'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'}
		};
		tranpose(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(Arrays.toString(ar[i]));
		}
	}
	public static char[][] tranpose(char[][]ar)
	{
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar[i].length; j++) {
				char temp ;
				if (j>i) {
					temp = ar[i][j];
					ar[i][j] = ar[j][i];
					ar[j][i] = temp;
				}
			}
		}
		return ar;
	}

}
