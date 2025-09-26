import java.util.Scanner;
class Grade
{
	public static void main(String[] args)
	{
		System.out.print("Enter Marks: ");
		int marks = new Scanner(System.in).nextInt();
		float percentage = (marks/600f)*100f;
		System.out.println("Percentage is: "+percentage+"%");
		String ans = (percentage>=75)?"Grade A":
			         (percentage>=65)?"Grade B":
			         (percentage>=35)?"Grade C": 
		             "Failed";
		System.out.println(ans);
	}
}