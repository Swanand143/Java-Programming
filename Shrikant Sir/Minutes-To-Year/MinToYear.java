import java.util.Scanner;
class MinToYear
{
	public static void main(String[] args)
	{
		System.out.print("Enter a min: ");
		long min = new Scanner(System.in).nextLong();
		long minInYear = (365*24*60);
		long totalYear = min/minInYear;
		long minInDay = (24*60);
	    long remMin = min%minInYear;
		long totalDay = remMin/minInDay;
		System.out.println(totalYear + " Years " + totalDay + " Days ");
	}
}