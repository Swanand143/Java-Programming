package stringprogramms;

public class Replace1stOccurance {
	
	public static void main(String[] args) {
		
		String s = "ganesha";
		System.out.println("Ans : "+replace1stOcc(s, 'a', 'b'));
	}
	public static String replace1stOcc(String s,char old,char naya)
	{
		boolean repalced = false;
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			if (!repalced && s.charAt(i)==old) {
				ans = ans+naya;
				repalced = true;
			}
			else {
				ans = ans+ s.charAt(i);
			}
		}
		return ans;
	}
}
