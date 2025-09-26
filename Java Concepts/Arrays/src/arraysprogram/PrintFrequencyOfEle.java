package arraysprogram;

import java.util.Arrays;

public class PrintFrequencyOfEle {
	public static void main(String[] args) {
		int[] ar = {11,22,12,1,1,01,12,1000,1000,1,1000};
		System.out.println(Arrays.toString(ar));
		frequencyOfEle(ar);
	}
	
// METHODS

	public static void frequencyOfEle(int[] ref) {
		int cnt = 0;
		for (int i = 0; i < ref.length; i++) {
			for (int j = 0; j < ref.length; j++) {
				if (ref[i] == ref[j]) {
					cnt++;
				}
			}
			
			boolean flag = true;
			for (int k = 0; k < i; k++) {
				if (ref[i] == ref[k]) {
					flag = false;
				}
			}
			
			if (flag) {
				System.out.println(ref[i] + " : " + cnt);
			}
			cnt = 0;
		}
	}
}