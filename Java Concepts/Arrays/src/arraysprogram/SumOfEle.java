package arraysprogram;

public class SumOfEle {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		System.out.println("Sum Of Elements = "+SumOfNum(arr));
		
	}
	public static int SumOfNum(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			
		}
		return sum ;
	}

}
