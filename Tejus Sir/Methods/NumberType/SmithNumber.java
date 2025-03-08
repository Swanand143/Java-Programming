public class SmithNumber 
{
	 // Main method to test the program
    public static void main(String[] args) 
	{
        int num = 666; // Example input
        if (isSmithNumber(num)) {
            System.out.println(num + " is a Smith Number.");
        } else {
            System.out.println(num + " is not a Smith Number.");
        }
    }

    // Method to calculate sum of digits of a number
    static int sumOfDigits(int num) 
	{
        int sum = 0;
        while (num > 0) 
		{
            sum += num % 10;
            num /= 10;
        }
        return sum;
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

    // Method to calculate sum of digits of prime factors
    static int primeFactorsSum(int num) 
		{
        int sum = 0;
        int temp = num;

        // Factor out 2 (smallest prime)
        while (temp % 2 == 0) 
		{
            sum += sumOfDigits(2);
            temp /= 2;
        }

        // Check for odd prime factors
        for (int i = 3; i * i <= temp; i += 2) 
		{
            while (temp % i == 0) 
			{
                sum += sumOfDigits(i);
                temp /= i;
            }
        }

        // If remaining number is a prime
        if (temp > 1) 
		{
            sum += sumOfDigits(temp);
        }

        return sum;
    }

    // Method to check if a number is a Smith number
    static boolean isSmithNumber(int num) 
	{
        if (isPrime(num)) return false; // Smith numbers are composite
        return sumOfDigits(num) == primeFactorsSum(num);
    }

}
