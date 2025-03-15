import java.util.Scanner;
class AtoZSeqNum2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n<--- Print A to Z Sequence Number --->\n");
		System.out.print("Enter Character : ");
		String str = sc.next().toUpperCase();
		int len = str.length();
		int value = 0;
		boolean flag = true;

        
        }
        if (!flag||len>2) 
		{
            System.out.println("Enter a valid character (A-Z only or Max 2 letters(AA)).");
		}
		else if(len==1)
		{
			value = str.charAt(0)-64;
			System.out.println(str+" : "+value);
		}
		else if (len==2)
		{
			value = ((str.charAt(0)-64)*26)+(str.charAt(1)-64);
			System.out.println(str+" : "+value);
		}
	}
}
