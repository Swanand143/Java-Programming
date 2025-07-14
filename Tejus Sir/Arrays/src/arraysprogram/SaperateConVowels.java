package arraysprogram;

import java.util.Arrays;

public class SaperateConVowels {
	public static void main(String[] args) {
		char[] ar = {'a', 'e','b', 'c', 'd', 'i', 'o', 'u', 'g'};
		System.err.println("MAIN ARRAY");
		System.out.println(Arrays.toString(ar));
		System.err.println("\nSEPARATED IN 1 ARRAY");
		System.out.println(Arrays.toString(saparateConsVowels(ar)));
		System.err.println("---------------------------------------------");
		System.err.println("SEPARATED IN 2 ARRAY");
		saparateConsVowels1(ar);
		
		System.err.println("----------------------------------------------");
		String str = "Ganesh";
		System.err.println("SEPARATED FROM STRING");
		System.out.println("MAIN STRING : " + str);
		System.out.println(Arrays.toString(saparateConsVowels(str)));
	}
	
//	METHODS
//	Count the Vowels from Array
	public static int cntVowels(char[] ref) {
	int cnt = 0;
	for (int i = 0; i < ref.length; i++) {
		if (ref[i] == 'a' || ref[i]  == 'e' || ref[i] == 'i' || ref[i] == 'o' || ref[i] == 'u') {
			cnt++;
		}
	}
	return cnt;
	}
	
//	Using 1 Arrays to separates for Both Consonants and Vowels.
	public static char[] saparateConsVowels(char[] ref) {
		char[] ans = new char[ref.length];
		int m = 0, j = ref.length-1;
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] == 'a' || ref[i]  == 'e' || ref[i] == 'i' || ref[i] == 'o' || ref[i] == 'u') {
				ans[m] = ref[i];
				m++;
			}
			else {
				ans[j] = ref[i];
				j--;
			}
		}
		return ans;
	}
	
//	Using 2 Arrays to separates for Both Consonants and Vowels.
	public static void saparateConsVowels1(char[] ref) {
		char[] vowels = new char[cntVowels(ref)];
		char[] con = new char[ref.length - cntVowels(ref)];
		int m1 = 0, m2 = 0;
		
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] == 'a' || ref[i]  == 'e' || ref[i] == 'i' || ref[i] == 'o' || ref[i] == 'u') {
				vowels[m1] = ref[i];
				m1++;
			}
			else {
				con[m2] = ref[i];
				m2++;
			}
		}
		System.out.println("VOWELS ARRAY : " + Arrays.toString(vowels));
		System.out.println("CONSONENTS ARRAY : " + Arrays.toString(con));
	}
	
//	From String to separates for Both Consonants and Vowels.
	public static char[] saparateConsVowels(String ref) {
		char[] ans = new char[ref.length()];
		int m1 = 0 , m2 = ans.length-1;
		for (int i = 0; i < ref.length(); i++) {
			char ch = ref.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				ans[m1] = ch;
				m1++;
			}
			else {
				ans[m2] = ch;
				m2--;
			}
		}
		return ans;
	}

	



}
