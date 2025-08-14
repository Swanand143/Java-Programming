package stringprogramms;

import java.util.Arrays;
import java.util.Iterator;

public class Combinations {
	
	public static void main(String[] args) {
		
		char[] ch = {'a','b','c',};
		createPermutations(ch, 0);
	}
	public static void createPermutations(char[]ar,int refIndex)
	{
		if (refIndex == ar.length-1) {
			System.out.println(Arrays.toString(ar));
			return;
		}
		for (int i = refIndex; i < ar.length; i++) {
			swap(ar,i,refIndex);
			createPermutations(ar, refIndex+1);
			swap(ar,refIndex,i);
		}
	}
	public static void swap(char[] ar,int index,int refIndex)
	{
		char temp = ar[index];
		ar[index] = ar[refIndex];
		ar[refIndex] = temp;
	}
}
