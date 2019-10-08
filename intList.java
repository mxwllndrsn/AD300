import java.util.ArrayList;
import java.util.Scanner;

public class intList{
	public static void main(String args[]){
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers (input ends with 0):");
		int val;
	
		do {
			val = input.nextInt();
			if(!list.contains(val)&&val!=0)
				list.add(val);
		} while(val!=0);
		System.out.println("Distinct numbers are: ");
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i) + " ");		
	}
}