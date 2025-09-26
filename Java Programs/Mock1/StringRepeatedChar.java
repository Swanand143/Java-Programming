import java.util.Scanner;
class StringRepeatedChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next().toUpperCase();
		int max = 0;
		char maxrapeat = ' ';
		for (char ch = 'A'; ch<='Z'; ch++) 
		{
			int cnt = 0;
			for (int i = 0; i<str.length(); i++ ) 
			{
				if(ch == str.charAt(i)){
					cnt++;

				}

				
			}
			if(max<cnt){
				max = cnt;
				maxrapeat = ch;

			}
			
		}
		System.out.println(max+"."+maxrapeat);

		
	}
}