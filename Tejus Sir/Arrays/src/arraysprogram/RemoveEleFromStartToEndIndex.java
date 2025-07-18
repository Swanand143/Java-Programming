package arraysprogram;

import java.util.Arrays;

public class RemoveEleFromStartToEndIndex {
	
   public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5,6,7,8,9,10};
		System.out.println
		("MAIN ARRAY : " + Arrays.toString(ar));
		
		System.out.println
		("NEW ARRAY : " + Arrays.toString(removeEleFromStartIndexToEndIndex(ar, 2, 6)));
	}
	
//	METHODS
//	Get the Count of Element From Start index to end index
	public static int getCountOfEle(int[] ref, int index1, int index2) {
		int cnt = 0;
		for (int i = 0; i < ref.length; i++) if (i >= index1 && i<=index2) cnt++;
		return cnt;
	}
	
//	Removing element from start index to end index
	public static int[] removeEleFromStartIndexToEndIndex(int[] ref, int index1, int index2) {
	
		if ((index1 >=0 && index1<ref.length) && (index2 >= 0 && index2 <=ref.length) && (index1<=index2)) {
			
			int[] ans = new int [ref.length - getCountOfEle(ref, index1, index2)];
		
			int i = 0;
			while(i < ans.length) {
				if (i < index1) {
					ans[i] = ref[i];
				}
				else if(i >= index1 && i <= index2) {
					ans[i] = ref[getCountOfEle(ref, index1, index2) + i];
				}
				else {
					ans[i] = ref[getCountOfEle(ref, index1, index2) + i];
				}
				i++;
			}
			return ans;
		}
		else {
			return null;
		}
	}
	


}
