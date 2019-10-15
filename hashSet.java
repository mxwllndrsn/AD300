import java.util.*;

public class hashSet{
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		
		set.add("London");
		set.add("Albequrque");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("New York");

		System.out.println(set);

		for(String s : set){
			System.out.print(s.toUpperCase()+" ");
		}
		for(String s:set)
			System.out.print(s.toLowerCase()+" ");
	}
}