package stringprogramms;

public class CheckStringPalindrome {
	
	public static void main(String[] args) {
		
		String s = "nayan";
		checkPalindrome(s);
	}
	public static void checkPalindrome(String s)
	{
		int i;
		for (i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				break;
			}
		}
		if(i>=s.length()/2)
		{
			System.out.println("It Is Palindrome");
		}
		else{
			System.out.println("It Is Not Palindrome");
		}
			
	}

}
