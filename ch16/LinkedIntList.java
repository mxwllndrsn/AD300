// linked list integer class

public class LinkedIntList implements IntList{

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
	public void addSorted(int value){
		if(head==null||value<head.data)
			head = new ListNode(value, head);
		else {
			ListNode curr=head;
			while(curr.next!=null && curr.next.data < value)
				curr = curr.next;
			// insert a new node ahead of current position with next assigned to current next
			curr.next = new ListNode(value, curr.next);
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

	// get value at given index
	// precon: 0<=index<=size()
	public int get(int index){
		ListNode curr = head;
		// we can index by way of iterating next ptr assignments
		for(int i=0; i<index; i++)
			curr = curr.next;
		return curr.data;
	}
	public void add(int index, int value){
		if(index==0){
			// add to front
			head = new ListNode(value, head);
		} else {
			ListNode curr = head;
			for(int i=0; i<index-1; i++)
				curr = curr.next;
			curr.next = new ListNode(value, curr.next);
		}
	}
	// removes and returns head
	public int remove(){
		if(head==null)
			return -1;//throw new NoSuchElementException();
		else {
			int res = head.data;
			head = head.next;
			return res;
		}
	}
	public void remove(int index){
		if(index==0)
			head=head.next;
		else {
			ListNode curr = head;
			for(int i=0; i<index-1; i++)
				curr = curr.next;
			curr.next = curr.next.next;
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
