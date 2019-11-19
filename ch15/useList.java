import java.util.*;

public class useList{

	public static void main(String[] args){
		ArrayIntList newList = new ArrayIntList();
		int size=Integer.parseInt(args[0]);
		if(size>10){
			System.out.println("\n error: size must be less than or equal to 10");
		} else {
			for(int i=0; i<size; i++){
				newList.add(i);
			}
			System.out.println("\n"+newList);
		}
	}
}