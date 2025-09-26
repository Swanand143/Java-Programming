package arraysprogram;

public class CheckSortedArray {

   
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
        return true;  
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 8, 9, 10};

        System.out.println("Array 1 is sorted? " + isSorted(arr1));
        System.out.println("Array 2 is sorted? " + isSorted(arr2));
    }
}

