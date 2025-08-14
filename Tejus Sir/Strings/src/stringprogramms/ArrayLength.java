package stringprogramms;

public class ArrayLength {
	
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int count = 0;
        try {
            while (true) {
                int temp = arr[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
           
        }

        System.out.println("Length of the array: " + count);
    }

}
