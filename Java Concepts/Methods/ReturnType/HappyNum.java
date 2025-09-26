class HappyNum
{
	public static void main(String[] args) 
	{
		for (int start=1; start<=1000; start++) 
		{
			if (isHappy(start)) 
			{
				System.out.println(start);
			}
		}
	}
	public static boolean isHappy(int num)
	{
		int sum = sumOfAqOfDigit(num);
		while(sum!=4 && sum!=1)
		{
			sum = sumOfAqOfDigit(sum);
		}
		return sum==1?true:false;
	}
	public static int sumOfAqOfDigit(int num)
	{
		int sum = 0;
		while(num!=0)
		{
			int last = num%10;
			sum+=(last*last);
			num/=10;
		}
		return sum;
	}
}