package HackerRankPart1;

//Problem: Weirdo Number
//
//Objective:
//Test your knowledge of if-else conditional statements by determining whether a given integer is "Weird" or "Not Weird" based on specific rules.
//Task:
//Given an integer n, perform the following conditional actions:
//If n is odd, print "Weird".
//If n is even and in the inclusive range 2 to 5, print "Not Weird".
//If n is even and in the inclusive range 6 to 20, print "Weird".
//If n is even and greater than 20, print "Not Weird".
//Complete the stub code provided in your editor to print whether n is "Weird" or "Not Weird".
//Input Format:
//A single line containing a positive integer n.
//Constraints:
//1 ≤ n ≤ 100 (assume a reasonable upper limit for simplicity)
//Output Format:
//Print "Weird" if the number is weird; otherwise, print "Not Weird".
//Sample Input 0:
//3
//Sample Output 0:
//Weird
//Sample Input 1:
//24
//Sample Output 1:
//Not Weird

import java.util.Scanner;

public class H2 {
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 != 0) {  // odd numbers
            System.out.println("Weird");
        } else {  // even numbers
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
    }

}
