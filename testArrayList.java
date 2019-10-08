import java.util.*;
// specifically java.util.ArrayList

public class testArrayList{
	public static void main(String args[]){

	//create arraylist to store city names as strings
		ArrayList<String> cityList = new ArrayList<String>();
	
	//add some cities to the list
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");

	//display size of list	
		System.out.println("List size: " + cityList.size());		
	//check if miami is in the list
		System.out.println("Is \'Miami\' in the list? " + 
			cityList.contains("Miami"));
	//get position of denver
		System.out.println("The index of \'Denver\' is: " +
			cityList.indexOf("Denver"));
	//check if list is empty
		System.out.println("Is this list empty? " +
			cityList.isEmpty());
	//insert new city at index 2
		cityList.add(2, "Xian");
	//remove "Miami"
		cityList.remove("Miami");
	//remove city at index 1
		cityList.remove(1);
	//display list contents
		System.out.println(cityList.toString());
	//display list without tostring method
		System.out.println(cityList);
	//display list contents in reverse order
		for(int i=cityList.size()-1; i>=0; i--)
			System.out.print("\t" + cityList.get(i));
	//clear println
		System.out.println("\n");

	//create arraylist to store circles
		ArrayList<Circle> list = new ArrayList<>();
		list.add(new Circle(2));
		list.add(new Circle(3));
	//display area of 1st circle in list
		System.out.println("Area of first circle? " + 
			list.get(0).getArea());		
	}
}