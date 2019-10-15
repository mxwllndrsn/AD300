import java.util.*;

public class a{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int val, low = 2147483647, high = 0, total = 0;
		do{
			System.out.println("enter number");
			val = console.nextInt();
			total += val;
			if(isHigh(high, val)){
				high = val;
				System.out.println("new highest value: " + high);
			} else if(isLow(low, val)){
				low = val;
				System.out.println("new lowest value: " + low);
			}
		} while (val != 0);
		System.out.print("total is: " +total);
	}

	static boolean isHigh(int high, int val){
		return(val>high);
	}
	static boolean isLow(int low, int val){
		return(val<low);
	}
}		