import java.util.*;

public class al{
	public static void main(String args[]){
/*		ArrayList<String> test = new ArrayList<String>();
		
		test.add("asdfasdf");
		test.add(0, "qwerqwer");
		test.add(1, "i should be in the middle");
		test.add("this arraylist is this long: " + (test.size()+1));
		System.out.println(test);
	
		String[] asdf = new String[5];
		
		asdf[0] = "i'm just a normal array";
		asdf[1] = "only two of my elements are utilized";
		System.out.println(Arrays.toString(asdf));

		System.out.println("does the arraylist contain \'qwerqer\'?: " + test.contains("qwerqwer"));
		System.out.println("does the arraylist contain \'eee\'?: " + test.contains("eee"));
		System.out.println("add \'eee\' to the front");
		test.add(0, "eee");
		System.out.println("remove \'qwerqwer\'");
		test.remove("qwerqwer");
		System.out.println("our arraylist has changed! " + test);
	
		System.out.println("we're printing the list backwards: \n");
		for(int i = test.size()-1; i>=0; i--)
			System.out.print(test.get(i)+ ", ");
*/

		ArrayList<String> example = new ArrayList<>(
			List.of("asdf", "qwer", ";lkj", "opiu"));
		System.out.println(example);
	}
}