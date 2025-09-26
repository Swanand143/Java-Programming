package stringprogramms;

public class RplaceChar {
	
	public static void main(String[] args) {
		
		String s = "ABCDZ";
		System.out.println("Ans : "+replace(s, 'Z', 'E'));  
	}
	
	public static String replace(String s, char ch1, char ch2) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch1) {
				ans = ans + ch2;   
			} else {
				ans = ans + s.charAt(i);  
			}
		}
		return ans;
	}
}
