package stringprogramms;

public class ContainsOf {
	
	public static void main(String[] args) {
		
		String s1 = "aeroplane";
		String s2 = "plane";
		System.out.println("Ans : "+contains(s1, s2));
	}
	public static boolean contains(String s1,String s2)
	{
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)==s2.charAt(0)) {
				int j = 0 , k = i;
				for (int k2 = 0; k2 < s2.length(); k2++) {
					if (s1.charAt(k)==s2.charAt(j)) {
						j++;
						k++;
					}
					else {
						break;
					}
				}
				if (j==s2.length()) {
					return true;
				}
			}
		}
		return false;
	}
}
