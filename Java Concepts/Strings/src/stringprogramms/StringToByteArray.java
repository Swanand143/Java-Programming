package stringprogramms;

import java.util.Arrays;

public class StringToByteArray {
	
	public static void main(String[] args) {
		
		String s = "India is my country";
		System.out.println("Ans1 : "+Arrays.toString(toByteArray(s)));
		System.out.println("Ans2 : "+Arrays.toString(s.getBytes()));
	}
	public static byte[] toByteArray(String s)
	{
		byte[] ar = new byte[s.length()];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (byte)s.charAt(i);
		}
		return ar;
	}

}
