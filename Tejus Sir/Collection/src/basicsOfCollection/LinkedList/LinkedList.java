package basicsOfCollection.LinkedList;

public class LinkedList {
	
	Node head;
	Node bhagwan;
	Node lastNodeRef;
	int size;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addVal(Object val)
	{
		if (head == null) {
			
			head = new Node(val);
			bhagwan = head;
			size++;
		}
		else {
			
			Node temp = new Node(val);
			bhagwan.nextRef = temp;
			temp.preRef = bhagwan;
			bhagwan = temp;
			size++;
		}
		return true;
	}
	
	public Node iterate()
	{
		return head;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean contains(Object val)
	{
		return containsVal(val)!=null;
	}
	
	private Node containsVal(Object val)
	{
		Node head  = iterate();
		
		while (head!=null) {
			
			if (((Integer)val).equals(((Integer)head.val))) {
				
				return head;
			}
			head = head.next();
		}
		return null;
	}
	
	public boolean addAll(LinkedList l)
	{
		Node head = l.iterate();
		
		while (head!=null) {
			
			addVal(head.val);
			head = head.next();
			size++;
		}
		return head==null;
	}
	
	public boolean addFirst(Object val)
	{
		if (head!=null) {
			
			Node temp = new Node(val);
			head.preRef = temp;
			temp.nextRef = head;
			head = temp;
			size++;
			return true;
		}
		else {
			return addVal(val);
		}
	}
	
	public boolean addLast(Object val)
	{
		return addVal(val);
		//size++;
	}
	
	public void clear()
	{
		bhagwan= null;
		head = null;
	}
	
	public boolean removeAll(LinkedList l)
	{
		Node head = l.iterate();
		
		while (head!=null) {
			
			if (contains(head.val)) {
				
				removeVal(head.val);
				size++;
			}
			head = head.next();
		}
		return head == null;
	}
	
	public boolean retainAll(LinkedList l)
	{
		LinkedList temp = new LinkedList();
		Node head = l.iterate();
		
		while (head!=null) {
			
			Node ref = containsVal(head.val);
			
			if (ref!=null) {
				
				temp.addVal(head.val);
			}
			head = head.next();
		}
		this.head = temp.head;
		this.bhagwan = temp.bhagwan;
		return true;
	}
	
	public boolean containsAll(LinkedList l)
	{
		Node head =l.iterate();
		
		while (head!=null) {
			
			if (contains(head.val)) {
				
				head = head.next();
			}
			else {
				break;
			}
		}
		return head == null;
	}
	
	public boolean removeVal(Object val)
	{
		Node ref = containsVal(val);
		
		if (ref.nextRef==null) {
			
			bhagwan = ref.preRef;
			bhagwan.nextRef = null;
			size--;
			return true;
		}
		else if (ref.preRef==null) {
			
			head = ref.nextRef;
			head.preRef = null;
			size--;
			return true;
		}
		else if (ref!=null) {
			
			ref.nextRef.preRef = ref.preRef;
			ref.preRef.nextRef = ref.nextRef;
			size--;
			return true;
		}
		return false;
	}
	
	public boolean removeFirst()
	{
		if (head!=null) {
			
			head = head.nextRef;
			head.preRef = null;
			size--;
			return true;		
		}
		return false;
	}
	
	public boolean removeLast()
	{
		if (bhagwan!=null) {
			
			bhagwan = bhagwan.preRef;
			bhagwan.nextRef = null;
			size--;
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		if (head!=null) {
			
			Node head = iterate();
			StringBuilder sb = new StringBuilder();
			sb = sb.append("[");
			
			do {
				
				sb = sb.append(" "+head.val).append(",");
				head = head.next();
				
			} while (head!=null);
			
			sb = sb.deleteCharAt(sb.length()-1);
			sb = sb.append("]");
			return new String(sb);
		}
		return "[]";
	}
	
	public Node reverseIterate()
	{
		return bhagwan;
	}	
}
