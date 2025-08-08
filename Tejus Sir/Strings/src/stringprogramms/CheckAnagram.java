package stringprogramms;

import java.util.Iterator;
//all char of string1 is present in string2 or not
public class CheckAnagram {
	
	public static void main(String[] args) {
		
		String s1 = "listen";
		String s2 = "silent";
		System.out.println("Ans : "+checkAnagram(s1, s2));
	}
	public static boolean checkAnagram(String s1,String s2)
	{
		if (s1.length()==s2.length()) {
			int [] ar1 = new int[127];
			int [] ar2 = new int[127];
			for (int i = 0; i < s1.length(); i++) {
				ar1[s1.charAt(i)]++;
				ar2[s2.charAt(i)]++;
			}
			for (int i = 0; i < ar2.length; i++) {
				if (ar1[i]!=ar2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
