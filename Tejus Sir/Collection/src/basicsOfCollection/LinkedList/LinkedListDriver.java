package basicsOfCollection.LinkedList;

public class LinkedListDriver {
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		l1.addVal(40);
		l1.addVal(50);
		l1.addVal(60);
		l1.addVal(70);
		l1.addVal(80);
		l1.addVal(90);
		l1.addVal(100);
		
		Node ref = l1.reverseIterate();
		while (ref != null) {
		    System.out.println(ref.val);
		    ref = ref.previous();
		}
	}

}
