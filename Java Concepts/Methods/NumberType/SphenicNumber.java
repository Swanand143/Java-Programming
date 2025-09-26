public class SphenicNumber 
{
	// Main method to test the program
    public static void main(String[] args) 
	{
        int num = 30; // Example input
        if (isSphenicNumber(num)) 
		{
            System.out.println(num + " is a Sphenic Number.");
        } else 
		{
            System.out.println(num + " is NOT a Sphenic Number.");
        }
    }

    // Method to check if a number is prime
    static boolean isPrime(int num) 
	{
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) 
		{
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a Sphenic Number
    static boolean isSphenicNumber(int num) 
	{
        int count = 0;
        int product = 1;

        // Checking for prime factors
        for (int i = 2; i <= num; i++) 
		{
            if (isPrime(i) && num % i == 0) 
			{ // If i is a prime factor
                count++;
                product *= i;

                // Remove all occurrences of this factor
                while (num % i == 0) 
				{
                    num /= i;
                }
            }
        }

        // A number is Sphenic if it has exactly 3 distinct prime factors
        return count == 3 && product > 0;
    }
}
