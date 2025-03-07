import java.util.Scanner;

class BouncyNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number :");
        int num = new Scanner(System.in).nextInt();
        
        if (isBouncy(num)) {
            System.out.println(num + " is a Bouncy Number");
        } else {
            System.out.println(num + " is not a Bouncy Number");
        }
    }

    public static boolean isIncreasing(int num) {
        int lastDigit = num % 10;
        num /= 10;
        
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit > lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            num /= 10;
        }
        return true;
    }

    public static boolean isDecreasing(int num) {
        int lastDigit = num % 10;
        num /= 10;
        
        while (num > 0) {
            int currentDigit = num % 10;
            if (currentDigit < lastDigit) {
                return false;
            }
            lastDigit = currentDigit;
            num /= 10;
        }
        return true;
    }

    public static boolean isBouncy(int num) {
        return !(isIncreasing(num) || isDecreasing(num));
    }
}

