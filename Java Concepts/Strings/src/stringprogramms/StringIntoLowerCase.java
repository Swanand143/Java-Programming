package stringprogramms;

public class StringIntoLowerCase {
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		System.out.println("Lower Case : "+toLower(s));
		
	}
	public static String toLower(String s)
	{
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char ch =s.charAt(i);
			if (ch>='A' && ch<='Z') {
				ans = ans+(char)(ch+32);
			}
			else {
				ans+=ch;
			}
		}
		return ans;
	}

}
