package arraysprogram;

public class MinElement {
	
	public static void main(String[] args) {
		int[] arr = {2,-1,7,5,6,3};
		System.out.println("Min Element = "+min(arr));
		System.out.println("Second Min Element = "+secMin(arr));
		System.out.println("Third Min Element = "+thirMin(arr));
	}
	//max element
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE; //-2147483648
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min ; 
	}
	//Second min element
	public static int secMin(int[] arr) {
		int min = Integer.MAX_VALUE; //-2147483648
		int secMin =Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secMin = min ;
				min = arr[i];
			}
			else if (arr[i]<secMin && arr[i]!=min) { //&& arr[i]!=min when we not want min = secMin
				secMin = arr[i];
			}
		}
		return secMin ; 
	}
	//Third Min Element
	public static int thirMin(int[] arr) {
		int min = Integer.MAX_VALUE; //-2147483648
		int secMin = Integer.MAX_VALUE;
		int thirMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				thirMin = secMin;
				secMin = min ;
				min = arr[i];
			}
			else if (arr[i]<secMin && min != arr[i]) { 
				thirMin = secMin;
				secMin = arr[i];
			}
			else if(arr[i]<thirMin && (min != arr[i] && secMin != arr[i] )) {
				thirMin = arr[i];
			}
		}
		return thirMin ; 
	}
	

}
