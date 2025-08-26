package basicOfCollection;

public class LinkedList {
	
	Node head;
	Node bhagwan;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addVal(Object val)
	{
		if (head == null) {
			head = new Node(val);
			bhagwan = head;
		}
		else {
			Node temp = new Node(val);
			bhagwan.nextRef = temp;
			temp.preRef = bhagwan;
			bhagwan = temp;
		}
		return true;
	}
	
	public Node iterate()
	{
		return head;
	}
}
