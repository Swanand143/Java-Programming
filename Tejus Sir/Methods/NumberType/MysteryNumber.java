public class MysteryNumber 
{
	 // Main method to test the program
    public static void main(String[] args) 
	{
        int num = 121; // Example input
        if (!isMysteryNumber(num)) 
		{
            System.out.println(num + " is NOT a Mystery Number.");
        }
    }

    // Method to reverse a number
    static int reverseNumber(int num) 
	{
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // Method to check if a number is a Mystery Number
    static boolean isMysteryNumber(int num) 
	{
        for (int i = 1; i <= num / 2; i++) 
		{
            int rev = reverseNumber(i);
            if (i + rev == num) 
			{
                System.out.println(num + " is a Mystery Number because " + i + " + " + rev + " = " + num);
                return true;
            }
        }
        return false;
    }
}
