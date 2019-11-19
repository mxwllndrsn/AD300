import java.util.*;

public class useList{

	public static void main(String[] args){
		ArrayIntList newList;
		if(args.length>0){
			newList = new ArrayIntList(Integer.parseInt(args[0]));
		} else {
			newList = new ArrayIntList();
		}
		for(int i=0; i<newList.length(); i++){
			newList.add(i);
		}

		System.out.println("\ncontents: "+newList);
/*		newList.remove(1);
		newList.add(5, 7);
		System.out.println("\nremove i[1] add(7)[5]: "+newList);
*/
		System.out.println("using iterator:");
		
		ArrayIntListIterator listIter = newList.iterator();

		while(listIter.hasNext()){
			System.out.println(listIter.next()+" removed");
			listIter.remove();
		}
		System.out.println("list contents: "+newList);
	}
}
