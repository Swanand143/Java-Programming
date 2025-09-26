import java.util.Scanner;
class Return8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		boolean flag  = true;
	    if (isPrime(num)) 
	    {

	    	int rot = rotate(num);
	    	while(rot!=num)
	    	{
	    		if (!(isPrime(rot)))
		        {
			       flag = false;
			       break; 
		        }
		        System.out.println(rot);
		        rot = rotate(rot);
	    	}
	    	if (flag) 
	    	{
	    		System.out.println("All rotation are prime");
	    		
	    	}
	    	else{
	    		System.out.println("Entered number is prime but all rotaions are not prime");
	    	}
	    }
	    else 
	    {
	    	System.out.println("Entered number is not prime");
	    }
	}
	public static int rotate(int num)
	{
		int last = num%10;
		num/=10;
		int ct = count(num);
		return last * power(10,ct)+num;
		//return (num%10)*power(10,(count(num)-1))+(num/10);
	}
	public static int count(int num)
	{
		int ct = 0;
		while(num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}
	public static int power(int digit,int ct)
	{
		int pow = 1;
		for (int i=0; i<ct; i++) 
		{
			pow*=digit;
		}
		return pow;
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		for (; den<num; den++) 
		{
			if (num%den==0) 
			{
				return false;
			}
		}
		return true;
	}
}