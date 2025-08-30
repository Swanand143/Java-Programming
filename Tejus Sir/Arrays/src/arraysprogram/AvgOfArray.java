package arraysprogram;

public class AvgOfArray {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70};
		System.out.println("Average Of Array : "+avgOfArray(arr));
	}
	
	public static int avgOfArray(int [] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum/arr.length;
	}
}
