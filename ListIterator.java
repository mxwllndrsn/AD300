import java.util.*;

public class ListIterator{
	public static void main(String[] args){
		LinkedList<String> llist = new LinkedList<>();
		llist.add("A");
		llist.add("B");
		llist.add("C");
		llist.add("D");
		llist.add("E");

		//create listiterator
		ListIterator<String> iterator = llist.listIterator();

		//traverse forwards
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		System.out.println();

		//traverse backwards
		while(iterator.hasPrevious()){
			System.out.print(iterator.previous()+" ");
		}
		System.out.println();
	}
}