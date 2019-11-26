public class ListNode{
	int data;
	ListNode next;
	// default constructor in use

	// supplied constructors
	public ListNode(){
		this(0, null);
	}
	public ListNode(int data){
		this(data, null);
	}
	public ListNode(int data, ListNode next){
		this.data = data;
		this.next = next;
	}
}