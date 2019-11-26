import java.util.*;

public class ConstructList{
	public static void main(String[] args){
		ListNode list = new ListNode();

		ListNode ptr = list;
		for(int i=0; i<100; i++){
			ptr.next = new ListNode(i);
			ptr = ptr.next;
		}

		System.out.println(list.data+" "+list.next.data+" "+list.next.next.data);

		// traverse list
		ptr = list;
		while(ptr!=null){
			System.out.println(ptr.data);
			ptr = ptr.next;
		}

		LinkedIntList LList = new LinkedIntList();
		for(int i=0; i<100; i++)
			LList.add(i);
		System.out.println(LList);
		System.out.println(LList.head().data+" "+LList.tail().data);
	}
}