import java.util.*;
import java.io.*;


public class fibfac{
	public static void main(String[] args){
	
		long n=Integer.parseInt(args[0]);
		System.out.println("Fibonacci "+n+": "+fib(Integer.parseInt(args[0])));
		System.out.println("Factorial "+n+": "+fac(Integer.parseInt(args[0])));

		Scanner console = new Scanner(System.in);
		System.out.println("\nCompute fib sequence? (y/n)");
		
//		String input = console.nextLine().toLowerCase();		
//		if(input==("y")){
			System.out.println("Fibonacci Sequence: ");	
			fibSeq(Integer.parseInt(args[0]));
//		}
	/*
		System.out.println("factorial 5: "+fac(5));
		System.out.println("factorial 3: "+fac(3));
		System.out.println("factorial 2: "+fac(2));		
		System.out.println("factorial 0: "+fac(0));
	*/	
	}

	public static long fac(long n){
		if(n>1){
			return (n*fac(n-1));
		} else {
			return 1;
		}
	}

	public static long fib(long n){
		if(n>=2){
			return (fib(n-1)+fib(n-2));
		} else if(n==1){
			return 1;
		} else {
			return 0;
		}
	}
	public static long fibSeq(long n){
		System.out.println(n+" ");
		if(n>=2){
			return (fib(n-1)+fib(n-2));
		} else if(n==1){
			return 1;
		} else {
			return 0;
		}

	}
}
