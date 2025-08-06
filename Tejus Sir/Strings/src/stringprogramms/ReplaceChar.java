package stringprogramms;

public class ReplaceChar {
	
	public static void main(String[] args) {
		
		String s = "banana";
		System.out.println("Ans : "+replace(s, 'a', '@'));
	}
	public static String replace(String s,char old,char naya)
	{
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==old) {
				ans = ans+naya;
			}
			else {
				ans = ans+ s.charAt(i);
			}
		}
		return ans;
	}

}
