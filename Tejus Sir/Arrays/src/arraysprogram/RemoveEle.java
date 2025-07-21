package arraysprogram;

import java.util.Arrays;

public class RemoveEle {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		System.out.println
		("MAIN ARRAY : " + Arrays.toString(ar));
		System.out.println
		("UPDATED ARRAY : " + Arrays.toString(removeEle(ar, 5)));
	}
	
//	METHODS
	
//	To Find the index of an specific Element of array
	public static int indexOf(int[] ref, int ele) {
		int i = 0;
		while (i < ref.length) { //	To find the index of element
			if (ref[i] == ele) {
				break;
			}
			i++;
		}
		return i;
	}
	
//  Remove an Specific Element From an Array.
	public static int[] removeEle(int[] ref, int ele) {
		if (indexOf(ref, ele) < ref.length) {
		
		int[] upAr = new int[ref.length-1]; // 6
		int i = 0;
		while (i <= upAr.length) {
			if (i < indexOf(ref, ele)) {
				upAr[i] = ref[i];
			}
			else if(i > indexOf(ref, ele)) {
				upAr[i-1] = ref[i];
			}
			i++;
		}
		return upAr;
		}
		else {
			System.out.println("Element Not Found !");
			return null;
		}
	}


}
