package arrays;

public class Array4 {
	
	public static void main(String[] args) {
		
		String[] arr1 = new String[6];
		arr1[0]= "Harshal";
		arr1[1]= "Ganesh";
		arr1[2]= "Sanket";
		arr1[3]= "Aditya";
		arr1[4]= "Rohit";
		arr1[5]= "Swanand";
		
		for (int i = arr1.length-1 ; i >= 0; i--) {
			
			System.out.println(arr1[i]);			
		}
	}

}
