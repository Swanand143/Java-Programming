import java. util. Scanner;
class Vowels2
{
	public static void main(String [] args)
	{
	System.out.print("Enter a Alphabet: ");
    char ch = new Scanner(System.in).next().charAt(0);

	System.out.println((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?(ch+" is vowel"):(ch+" is not vowel"));
	}
}
