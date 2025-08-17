package stringprogramms;

public class ExtractNumFromString {
	
	public static void main(String[] args) {
		
		String s = "92Simon12Go@14";
		System.out.println("Ans : "+ExtractNum(s));
		
	}
	public static int ExtractNum(String s)
	{
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				ans = ans+s.charAt(i);
			}
		}
		return Integer.parseInt(ans);
	}

}
