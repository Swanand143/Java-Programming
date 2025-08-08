package stringprogramms;

import java.util.Iterator;
//check all a to z chars are present in the string or not			
public class CheckPanagram {
	
	public static void main(String[] args) {
		
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Ans : "+isPanagram(s1));
	}
	public static boolean isPanagram(String s1)
	{
		int [] ct = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch>='a' && ch<='z') {
				ct[ch-97]++;
			}
			else if (ch>='A' && ch<='Z') {
				ct[ch-65]++;
			}
		}
		for (int i = 0; i < ct.length; i++) {
			if (ct[i]==0) {
				return false;
			}
		}
		return true;
	}

}
