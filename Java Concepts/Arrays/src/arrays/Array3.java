package arrays;

public class Array3 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println("Array Size = "+arr.length);// fetch the size of an array
		
		for(int index=0; index<arr.length;index++)
		{
			System.out.println(arr[index]);
		}
	}
}