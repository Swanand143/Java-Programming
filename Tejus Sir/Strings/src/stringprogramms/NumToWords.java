package stringprogramms;

public class NumToWords {

    private static final String[] ones = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int num = -1200312;
        System.out.println(convert(num));
    }

    public static String convert(int num) {
        if (num == 0) return "Zero";
        if (num < 0) return "Minus " + convert(-num);

        String result = "";

        if (num / 10000000 > 0) {
            result += onesAndTens(num / 10000000) + "Crore ";
            num %= 10000000;
        }

        if (num / 100000 > 0) {
            result += onesAndTens(num / 100000) + "Lakh ";
            num %= 100000;
        }

        if (num / 1000 > 0) {
            result += onesAndTens(num / 1000) + "Thousand ";
            num %= 1000;
        }

        if (num / 100 > 0) {
            result += ones[num / 100] + "Hundred ";
            num %= 100;
        }

        if (num > 0) {
            result += onesAndTens(num);
        }

        return result.trim();
    }

    private static String onesAndTens(int num) {
        if (num < 20) {
            return ones[num] + " ";
        } else {
            return tens[num / 10] + " " + ones[num % 10] + " ";
        }
    }
}
