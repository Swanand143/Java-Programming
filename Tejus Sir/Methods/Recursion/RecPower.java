import java.util.Scanner;
class RecPower
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a base : ");
	    int base = sc.nextInt();
	    System.out.print("Enter a power : ");
	    int raiseto = sc.nextInt();
	    System.out.println("Ans is : "+power(base,raiseto));
    }
    public static int power(int base,int raise)
    {
    	if (raise==0) 
    	{
    		return 1;
    	}
    	return base*power(base,raise-1);
    }
} 