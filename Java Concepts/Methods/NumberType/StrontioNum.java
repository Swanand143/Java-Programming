import java.util.Scanner;

class StrontioNum 
{
    public static void main(String[] args) 
	{
        System.out.print("Enter a four-digit number: ");
        int n = new Scanner(System.in).nextInt();

        if (n < 1000 || n > 9999) 
		{
            System.out.println("Please enter a valid four-digit number.");
        } 
		else 
		{
            System.out.println(n + (isStrontio(n) ? " is a Strontio number" : " is not a Strontio number"));
        }
    }

    public static boolean isStrontio(int num) 
	{
        int multi = num * 2;
        int num1 = (multi / 10) % 10; // Extract second last digit
        int num2 = (multi / 100) % 10; // Extract third last digit

        return num1 == num2; // Check if second and third last digits are the same
    }
}