import java.util.*;

public class pal{
	public static void main(String[] args){
		String input = args[0];
		System.out.println("\n"+isPalindrome(input));		
	}

	public static boolean isPalindrome(String s){
		/* does it cost less to run base case checks up front or call up the stack to helper function?
		
		if(s.length()<=1)
			return true;
		else if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		else */
			return isPalindrome(s, 0, s.length()-1);
	}
	public static boolean isPalindrome(String s, int low, int high){
		if(high<=low)
			return true;
		else if(s.charAt(low)!=s.charAt(high))
			return false;
		else
			return isPalindrome(s, low+1, high-1);
	}

}