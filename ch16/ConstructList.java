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

		IntList LList = new LinkedIntList();
		for(int i=0; i<100; i++)
			LList.add(i*2);

		System.out.println(LList);
		System.out.println("head and tail: "+LList.head().data+" "+LList.tail().data);
		System.out.println("get(20): "+LList.get(20));
		LList.add(20, 500);
		System.out.println("added(500 @ 20)");
		LList.remove(20);
		System.out.println("removed index(20): "+LList);
		System.out.println("get(20): "+LList.get(20));
		LList.addSorted(8787);
		LList.addSorted(-3);
		LList.addSorted(10);
		System.out.println("addSorted(various): "+ LList);
	}
}