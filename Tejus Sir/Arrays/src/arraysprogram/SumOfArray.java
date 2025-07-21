package arraysprogram;

public class SumOfArray {
	
public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int ans = sumOfEle(arr);
		System.out.println("Sum of Array is : " + ans);
	}
	
//	Methods
	public static int sumOfEle(int[] ref) {
		int sum = 0;
		for (int i = 0; i < ref.length; i++) {
			sum += ref[i];
		}
		return sum;
	}

}
