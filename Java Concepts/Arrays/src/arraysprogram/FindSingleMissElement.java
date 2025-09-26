package arraysprogram;


public class FindSingleMissElement {
	
	public static void main(String[] args) {
		int arr1[] = {1,2,4,5,6};
		int sumOfNat = (MaxElement.max(arr1)*(MaxElement.max(arr1)+1))/2;
		System.out.println("Missing Element : "+(sumOfNat-SumOfArray.sumOfEle(arr1)));
	}

}
