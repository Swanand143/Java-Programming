package HackerRankPart1;

//Problem: Java Stdin and Stdout II
//
//Objective:
//Read an integer, a double, and a String from standard input (stdin), then print them in a specific format.
//Task:
//Complete the code to:
//Read an integer from input.
//Read a double from input.
//Read a String from input.
//Print the values in the following order and format:
//String: <your_string>
//Double: <your_double>
//Int: <your_integer>
//Important Note:
//When using nextLine() immediately after nextInt() or nextDouble(), remember that nextInt() and nextDouble() do not consume the newline character. To avoid reading an empty line, handle the newline properly.
//Input Format:
//Three lines of input:
//First line: an integer.
//Second line: a double.
//Third line: a String.
//Output Format:
//Print three lines as follows:
//String: <input_string>
//Double: <input_double>
//Int: <input_integer>
//Sample Input:
//42
//3.1415
//Welcome to HackerRank's Java tutorials!
//Sample Output:
//String: Welcome to HackerRank's Java tutorials!
//Double: 3.1415
//Int: 42

import java.util.Scanner;

public class H3 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
