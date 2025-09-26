package arraysprogram;

public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 0, 3, 0, 5, 0, 8};

        moveZeros(arr);

        System.out.println("Array after moving zeros to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
