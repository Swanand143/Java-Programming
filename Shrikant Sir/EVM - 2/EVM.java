import java.util.Scanner;
class EVM2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0 , cng= 0 , ss = 0 , aap =0 , mns = 0, nota =0;
		System.out.println();
		System.out.println("        WELCOME ");
		System.out.println();
		System.out.print("Enter the Population : ");
		int pop = sc.nextInt();

		for(int i = 1; i<=pop ; i++)
		{
			System.out.println();
			System.out.println("*** LIST OF PARTIES ***");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3.SHIV SENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. NOTA");
			System.out.println();
			System.out.print("Enter The Option : ");
			int opt = sc.nextInt();
			if (opt>=1 && opt<=6){
				if(opt==1){
					bjp++;
					System.out.println("ACHE DIN AYENGE");
				}
				if(opt==2){
					cng++;
					System.out.println("BHARAT TODO");
				}
				if(opt==3){
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if(opt==4){
					aap++;
					System.out.println("MUZE AZAAD KARO");
				}
				if(opt==5){
					mns++;
					System.out.println("JAI MAHARASTRA");
				}
				if(opt==6){
					nota++;
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}	
				}
				if(!(opt>=1 && opt<=6)){
					i--;
					System.out.println("INVALID OPTION");
				}
			
			}
			if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota){
				System.out.println("BJP HAS OWN THE ELECTION BY "+ bjp+" votes ");
			}
			else if(cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota){
				System.out.println("CONGRESS HAS OWN THE ELECTION BY "+ cng+" votes ");
			}
			else if(ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota){
				System.out.println("SHIV SENA HAS OWN THE ELECTION BY "+ ss+" votes ");
			}
			else if(aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota){
				System.out.println("AAP HAS OWN THE ELECTION BY "+ aap+" votes ");
			}
			else if(mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota){
				System.out.println("MNS HAS OWN THE ELECTION BY "+ mns+" votes ");
			}
			

		
	}
}
	