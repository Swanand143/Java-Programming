package stringprogramms;

public class IndexOf1stOcc {
	
	public static void main(String[] args) {
		
		String s = "bcdabaefa";
		System.out.println("Index of 1st Occurance : "+indexOf1sOcc(s, 'a'));
	}
	public static int indexOf1sOcc(String s,char ip)
	{
		int i;
		for (i = 0; i < s.length(); i++) {
			if (ip==s.charAt(i)) {
				break;
			}
		}
		return i;
	}
}
