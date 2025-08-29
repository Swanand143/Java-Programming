package basicsOfCollection.LinkedList;

public class LinkedSetDriver {
	
	public static void main(String[] args) {
		
		LinkedSet l1 = new LinkedSet();
		
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(40);
		l1.addVal(50);
		
		LinkedSet l2 = new LinkedSet();
		
		l1.addVal(10);
		l1.addVal(40);
		l1.addVal(60);
		l1.addVal(70);
		
		l1.addAll(l2);
		
		System.out.println(l1);
		System.out.println(l2);
	
	}

}
