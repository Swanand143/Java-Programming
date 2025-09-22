package HackerRankPart1;

//Problem Statement: Java Datatypes

//Objective
//Java has 8 primitive data types:

//char, boolean, byte, short, int, long, float, and double.

//For this exercise, we’ll focus only on the primitives that hold integer values:

//byte → 8-bit signed integer

//short → 16-bit signed integer

//int → 32-bit signed integer

//long → 64-bit signed integer

//Your task is to determine which of these data types can properly store a given integer.

//Input Format
//The first line contains an integer t, the number of test cases.
//Each test case consists of a single integer n, which may be very large or very small.

//Output Format
//For each input integer n:
//If the number can fit in one or more of the four primitive types, print:

//n can be fitted in:
//* dataType
//* dataType

//(Print each possible type on a new line, ordered from smallest to largest.)
//If the number cannot be stored in any of the four types, print
//n can't be fitted anywhere.

//Constraints
//−2^63 ≤ n ≤ 2^63 − 1 (if it fits in a long)
//Otherwise, n may be even larger, and you must handle that case

//Sample Input
//5
//-150
//150000
//1500000000
//213333333333333333333333333333333333
//-100000000000000

//Sample Output
//-150 can be fitted in:
//* short
//* int
//* long
//150000 can be fitted in:
//* int
//* long
//1500000000 can be fitted in:
//* int
//* long
//213333333333333333333333333333333333 can't be fitted anywhere.
//-100000000000000 can be fitted in:
//* long
import java.util.Scanner;

public class H6 {
	
	public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                // long check is always true since x is already long
                System.out.println("* long");
            } 
            catch(Exception e) {
                // If the input number is too large for a long
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

}
