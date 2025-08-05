package stringprogramms;

public class LargeCharOfString {
	
	public static void main(String[] args) {
		
		String s = "abcdefz";
		System.out.println("Large Char : "+largeChar(s));
		System.out.println("Ascii Value : "+(int)largeChar(s));
		
	}
	public static char largeChar(String s)
	{
		char max = Character.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>max) {
				max = ch;
			}
		}
		return max;
	}

}
