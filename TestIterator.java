import java.util.*;

public class TestIterator{
	public static void main(String[] args){
		LinkedList<String> llist = new LinkedList<>();
		llist.add("New York");
		llist.add("Atlanta");
		llist.add("Dallas");
		llist.add("Madison");

		//create an iterator
		Iterator<String> iterator = llist.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().toUpperCase()+" ");
		}
	}
}