import java.util.*;

public class factorial{
	public static void main(String[] args){
		System.out.println("factorial 5: "+fac(5));
		System.out.println("factorial 3: "+fac(3));
		System.out.println("factorial 2: "+fac(2));		
		System.out.println("factorial 0: "+fac(0));
	}

	public static int fac(int n){
		if(n>1){
			return (n*fac(n-1));
		} else {
			return 1;
		}
	}
}