import java.util.Scanner;
class Game1
{
	public static void main(String [] args)
	{
		Scanner ab = new Scanner(System.in);
		int rNum = 0; //store a random number between 1 to 3
		for( ; ; )
		{
			// math.random() Fn generats a double value from 0.0000...  something
			// we multiply the same value by 10
			// for getting an integer value from  math.random() Fn we used typeCasting
			int num =(int)(Math.random()*10);
			if(num>=1 && num<=3) //checked the digit is between 1 to 3
			{
				rNum = num; //then only store
				break; //if digit found between 1 to 3 then terminate the loop
			}
	
		}
		

		//whatever random value is generated we need to map it with the option
		String codeOpt = null ;
		if(rNum == 1){
			codeOpt = "STONE";
		}
		else if(rNum == 2){
			codeOpt = "PAPER";
		}
		else if(rNum == 3){
			codeOpt = "SCISSOR";
		}

		System.out.println();
		System.out.println("    WELCOME");
		System.out.println();
		System.out.println("1.STONE  2.PAPER  3.SCISSOR");
		System.out.print("Enter The Option : "); //ask the user to enter an option
		int opt = ab.nextInt();
		String userOpt = null;
		if(opt == 1){
			userOpt ="STONE";
		}
		else if(opt == 2){
			userOpt ="PAPER";
		}
		else if(opt == 3){
			userOpt ="SCISSOR";
		}
		else
		{
			System.out.println("INVALID OPTION");
			return; //if invalid option then terminate the execution
		}	

		System.out.println("User : "+userOpt+"  Bot : "+codeOpt);
		if((opt==1 && rNum==3)||(opt==2 && rNum==1)||(opt==3 && rNum==2))
		{
			System.out.println("User Wins");
		}
		else if((opt==1 && rNum==2)||(opt==2 && rNum==3)||(opt==3 && rNum==1))
		{
			System.out.println("Bot Wins");
		}
		else
		{
			System.out.println("Match Draw");
		}
		
	}
}