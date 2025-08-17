package stringprogramms;

public class RemoveSplChar {
	
	public static void main(String[] args) {
		String s = "AZbcg@13*dhd#";
		System.out.println("Ans : "+removeChar(s));
	}
	public static String removeChar(String s)
	{
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a' && s.charAt(i)<='z'|| s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='0' && s.charAt(i)<='9') {
				ans = ans + s.charAt(i);
			}
		}
		return ans;
	}
	

}
