package ExampleSet1;

import java.util.Iterator;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int n = 5;  
		int num = 0;  

		for (int i = 1; i <= n; i++) {
		    num += i;   
		    if (i < n) {   
		        for (int j = 0; j < i; j++) {
		            System.out.print((num - j) + " ");
		        }
		    } else {       
		        for (int j = i - 1; j >= 0; j--) {
		            System.out.print((num - j) + " ");
		        }
		    }
		    System.out.println();
		}
	}
}
