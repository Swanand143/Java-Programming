package HackerRankPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Problem Statement: Loops I
//
//Objective
//In this challenge, we’re practicing using loops to do some simple math.
//Task
//Given an integer, N, print its first 10 multiples.
//Each multiple i (where 1 ≤ i ≤ 10) should be printed on a new line in the form:
//N x i = result
//Input Format
//A single integer, N.
//Constraints
//2 ≤ N ≤ 20
//Output Format
//Print 10 lines of output; each line i (where 1 ≤ i ≤ 10) contains the result of:
//N x i = result
//Sample Input
//2
//Sample Output
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20
public class H4 {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
         for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        bufferedReader.close();
    }

}
