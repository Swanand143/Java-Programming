package basicsOfCollection.LinkedList;

public class LinkedListDriver {
	
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.addVal(10);
		l1.addVal(20);
		l1.addVal(30);
		Node head = l1.iterate();
		while (head != null) {
		    System.out.println(head.val);
		    head = head.next();
		}
	}

}
