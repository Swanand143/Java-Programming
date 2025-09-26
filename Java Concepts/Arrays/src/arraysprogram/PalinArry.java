package arraysprogram;

public class PalinArry {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,4,2,1};
		System.out.println(checkPalindrom(arr));
	}
	public static boolean checkPalindrom(int[] arr)
	{
		int i = 0 ,j = arr.length-1;
		
		while(i<j) {
			
			if(arr[i]==arr[j]) {
				
				i++;
				j--;
			}
			else {
				break;
			}
		}
		return i>=j;
	}

}
