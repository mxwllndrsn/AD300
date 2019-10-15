import java.util.*;

public class treeSet{
	public static void main(String[] args){
		Set<String> set1 = new HashSet<>();
		
		set1.add("London");
		set1.add("Albequrque");
		set1.add("New York");
		set1.add("San Francisco");
		set1.add("Beijing");
		set1.add("New York");

		System.out.println("set1: " + set1);

		TreeSet<String> treeSet = new TreeSet<>(set1);
		System.out.println("sorted tree set: " + treeSet);
		System.out.println("poll first: " + treeSet.pollFirst());
		System.out.println("poll last: " + treeSet.pollLast());
		System.out.println("remaining elements: " + treeSet);
	}
}