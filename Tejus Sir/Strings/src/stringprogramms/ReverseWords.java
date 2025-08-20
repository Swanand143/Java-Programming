package stringprogramms;

public class ReverseWords {
	
	public static void main(String[] args) {
		String str = "Mogambo khush Hua";
		System.out.println("Ans : "+revString(str));
		 
	}
	public static String revString(String s)
	{
		String ans = "";
		String [] arr = s.split(" ");
		for (int i = arr.length-1; i >= 0; i--) {
			ans = ans + arr[i];
			if (i != 0) {
				ans = ans + " ";
			}
		}
		return ans;
	}

}
