import java.util.*;

public class hashSet{
	public static void main(String[] args){
		Set<String> set1 = new HashSet<>();
		
		set1.add("London");
		set1.add("Albequrque");
		set1.add("New York");
		set1.add("San Francisco");
		set1.add("Beijing");
		set1.add("New York");

		System.out.println("set1: " + set1);

		Set<String> set2 = new HashSet<>();

		set2.add("London");
		set2.add("Shanghai");
		set2.add("Paris");
		System.out.println("set2 is: " + set2 + " and size is: " + set2.size());
		System.out.println("Taipei is in set2: " + set2.contains("Taipei"));

		set1.addAll(set2);
		System.out.println("set1 union set2 is: " + set1);

		set1.removeAll(set2);
		System.out.println("set1 difference set2 is: " + set1);

		set1.retainAll(set2);	
		System.out.println("set1 retaining all set2 is: " + set1);
	}
}