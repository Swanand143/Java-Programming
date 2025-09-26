package arrays;

public class Array1 {
	
	public static void main(String[] args) {
		
		int [] ar1 = new int[5];
		System.out.println(ar1);// print the reference of that array
		
		String [] ar2 = new String[3];
		System.out.println(ar2);
		
		double [] ar3 = new double[4];
		System.out.println(ar3);
		
		boolean [] ar4 = new boolean[2];
		System.out.println(ar4);
		
		short[] ar5 = new short[-1];
		System.out.println(ar5);//NegativeArraySizeException
	}

}
