import java.util.*;
class KeithNumber 
{
	/* it is a number in which sum of digit after replacing the first digit with second 
	   and second with third and the last is replaced by sum until the sum is equal to the 
	   original number 
	   742 --->  4 2 13 ---> 2 13 19  ---> 13 19 39 -------> 742

	*/
	public static void main(String[] args) 
	{
		System.out.print("Enter number :");
		int num = new Scanner(System.in).nextInt();          //742;
		int len = 0, sum = 0;
		int dup = num;
		boolean flag = true;
		for (int i = num;i>0 ;i/=10 )
		{
			len++;    // finding length of number
		}
		int [] arr = new int [len];    // creating a array of size same as number length

		for (int i =len-1 ;i>=0;i-- )  // adding number in the array
		{
			arr[i]=num%10;
			num/=10;
		}
		//System.out.print(Arrays.toString(arr));
		for (; ; )
		{
			// sum of each digit from array
			for (int i = 0;i<len ;i++ )
			{
				sum +=arr[i]; 
			}
			// swapping the array element and adding sum at last

			for (int i = 1;i<len ;i++ )
			{
				arr[i-1]=arr[i];
			}
			arr[len-1]=sum;   // adding the sum to last index of array
			if (sum == dup)
			{
				break;
			}
			if (sum>dup)
			{
				flag = false;
				break;
			}
			sum=0;
		}
		System.out.print(flag?dup+ " is a KEITH Number ":dup + " is not a KEITH Number");
	}
}