package arrays;

public class Array2 {
	
	public static void main(String[] args) {
		
		int [] arr1 = new int [5];
		System.out.println(arr1[0]);//0
		System.out.println(arr1[1]);//0
		System.out.println(arr1[2]);//0
		System.out.println(arr1[3]);//0
		System.out.println(arr1[4]);//0
		//System.out.println(arr1[-1]);// ArrayIndexOutOfBoundsException
		//System.out.println(arr1[5]);// ArrayIndexOutOfBoundsException
		
		String[] arr2 = new String[3];
		System.out.println(arr2[0]);//null
		System.out.println(arr2[1]);//null
		System.out.println(arr2[2]);//null
		
		boolean[] arr3 = new boolean[2];
		System.out.println(arr3[0]);//false
		System.out.println(arr3[1]);//false
	}

}
