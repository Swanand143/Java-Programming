package stringprogramms;

import java.util.Arrays;

public class StringToCharArray {
	
	public static void main(String[] args) {
		
		String s = "India is my country";
		System.out.println("Ans1 : "+Arrays.toString(convertToCharArray(s)));
		System.out.println("Ans2 : "+Arrays.toString(s.toCharArray()));
	}
	public static char[] convertToCharArray(String s)
	{
		char [] ar = new char[s.length()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.charAt(i);
		}
		return ar;
	}

}
