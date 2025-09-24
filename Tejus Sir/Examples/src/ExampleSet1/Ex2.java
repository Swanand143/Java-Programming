package ExampleSet1;

public class Ex2 {
	
	public static void main(String[] args) {
        int n = 5;     // number of rows
        int num = 2;   // start from first prime

        for (int i = 1; i <= n; i++) {      // rows
            for (int j = 1; j <= i; j++) {  // numbers in each row
                while (!isPrime(num)) {     // keep finding next prime
                    num++;
                }
                System.out.print(num + " "); 
                num++;  // move to next number
            }
            System.out.println();
        }
    }

    // simple prime check without sqrt
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i < x; i++) {  
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
