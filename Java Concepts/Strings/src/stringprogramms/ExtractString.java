package stringprogramms;

public class ExtractString {
	
	public static void main(String[] args) {
		
		String s = "Aeroplanedubai" ;
		System.out.println("Extracted String : "+extractString(s, 4, 8));
	}
	public static String extractString(String s, int start,int end)
	{
		if (start < 0 || end >= s.length() || start > end) {
			return "Invalid range!" ;
		}
		String ans = "";
		for (int i = start; i <= end; i++) {
			ans = ans+s.charAt(i);
		}
		return ans;
	}

}
