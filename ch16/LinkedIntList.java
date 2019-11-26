// linked list integer class

public class LinkedIntList{

	private ListNode head;

	// constructor	
	public LinkedIntList(){
		head = null;
	}
	public void add(int value){
		if(head==null)
			head = new ListNode(value);
		else {
			ListNode curr = head;
			// traverse to end
			while(curr.next!=null){
				curr = curr.next;
			}
			// add node at end 
			curr.next = new ListNode(value);
		}	
	}

	public ListNode head(){
		return head;
	}
	public ListNode tail(){
		if(head==null)
			return head;
		else {
			ListNode curr = head;
			// traverse to end
			while(curr.next!=null){
				curr = curr.next;
			}
		return curr;
		}
	}	
	public String toString(){
		if(head==null)
			return "[]";
		else {
			String retStr = "[" + head.data;
			ListNode curr = head.next;
			
			while(curr!=null){
				retStr += ", " + curr.data;
				curr = curr.next;
			}
			retStr += "]";
			return retStr;
		}
	}
}
