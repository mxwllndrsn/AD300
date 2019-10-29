import java.util.*;

public class arrsort{
	public static void main(String[] args){
		double[] numbers = {6.0, 4.4, 1.9};
		java.util.Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		char[] chars ={'a', 'A', '4', 'F'};
		java.util.Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));

		String[] words = {"foo", "bar", "baz", "ball"};
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}
}