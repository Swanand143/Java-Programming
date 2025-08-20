package stringprogramms;

public class CountVowelsCons {
	
	public static void main(String[] args) {	
		String s = "Abcdefghi";
		cntVowelsCons(s);	
	}
	public static void cntVowelsCons(String s)
	{
		int cnt1 = 0;
		int cnt2 = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {  
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            }
        }
		System.out.println("Vowels Count : "+cnt1);
		System.out.println("Consonants Count : "+cnt2);
	}
}
