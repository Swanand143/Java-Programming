package stringprogramms;

public class IndexOfLastOcc {
	
	public static void main(String[] args) {
		
		String s = "bcdabaefanxa";
		System.out.println("Index of Last Occurance : "+indexOfLastOcc(s, 'a'));
	}
	public static int indexOfLastOcc(String s,char ip)
	{
		int i;
		for (i = s.length()-1; i>0; i--) {
			if (ip==s.charAt(i)) {
				break;
			}
		}
		return i;
	}
}
