import java.util.*;

public class testMap{
	public static void main(String[] args){
		Map<String, Integer> hashMap = new HashMap<>();

		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 31);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);

		System.out.println("Display entries in hashmap: ");
		System.out.println(hashMap +"\n");

		//create a tree map from previous hashmap
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		
		System.out.println("Display entries in acscending order of key (of treemap):");
		System.out.println(treeMap);
		System.out.println("\nNames and Ages are: ");

		//method 1: iterate by keySet
		System.out.println("Method 1\n=======");
		for(String name:treeMap.keySet()){
			System.out.println("Name: "+name);
			System.out.println("Age: "+treeMap.get(name));
		}	
	}
}