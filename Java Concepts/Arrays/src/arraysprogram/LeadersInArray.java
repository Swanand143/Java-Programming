package arraysprogram;

public class LeadersInArray {
    public static void findLeaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1]; 
        
        System.out.print(maxFromRight + " ");
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        findLeaders(arr);
    }
}
