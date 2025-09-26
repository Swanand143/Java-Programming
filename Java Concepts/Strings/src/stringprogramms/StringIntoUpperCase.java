package stringprogramms;

public class StringIntoUpperCase {
	
	public static void main(String[] args) {
		
		String s = "abcd";
		System.out.println("Upper Case : "+toUpper(s));
		
	}
	public static String toUpper(String s)
	{
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char ch =s.charAt(i);
			if (ch>='a' && ch<='z') {
				ans = ans+(char)(ch-32);
			}
			else {
				ans+=ch;
			}
		}
		return ans;
	}
}
