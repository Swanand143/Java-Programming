package basicsOfCollection.LinkedList;

public class LinkedSet extends LinkedList{
	
	public LinkedSet() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean addVal(Object val)
	{
		if (!contains(val)) {
			
			return super.addVal(val);
			
		}
		return false;
	}
	
	public boolean addAll(LinkedList l)
	{
		Node head = l.iterate();
		
       
        	
    		while (head!=null) {
    			if (!contains(head)) {
    			addVal(head.val);
    			}
    			head = head.next();
    			size++;
    		
    		return head==null;
		}
        return false;
	}
	
	public boolean addFirst(Object val)
	{
		if (!contains(val)) {
			
			return super.addFirst(val);
		}
		return false;
	}
	
	public boolean addLast(Object val)
	{
		if (!contains(val)) {
			
			return super.addLast(val);
		}
		return false;
	}
}
