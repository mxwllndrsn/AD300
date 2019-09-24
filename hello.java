import java.util.*;

public class hello{
	public static void main(String[] args){
		System.out.println("hello world");
		int radius = Integer.parseInt(args[0]);
		if(radius>0){
			System.out.println("Area is: " + (radius*radius*3.14159));
		} else {
			System.out.println("Unable to calculate");
		}
		System.out.println(
			((radius % 2 == 0) ? radius + " is even" : radius + " is odd")
		);
		Scanner console = new Scanner(System.in);
		String input = console.nextln();
		System.out.println(input + " <- is what you said");
	}
}
