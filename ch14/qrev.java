import java.util.*;

public class qrev {
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		Integer[] ints = {1,2,3,4,5,5,5,6,8,9,0};

		System.out.println("Reverse your queue:");

		// load queue
		for(Integer i:ints)
			q.add(i);

		showQueue(q);
		System.out.println();
		
		// swamp and reverse queue
		while(!q.isEmpty())
			s.push(q.remove());
		while(!s.isEmpty())
			q.add(s.pop());

		showQueue(q);

		System.out.println("\nSum of queue: "+sumQueue(q));
		showQueue(q);
		removeFrom(q, 5);
		showQueue(q);
	}

	static void showQueue(Queue<Integer> qz){
		Queue<Integer> bkp = new LinkedList<>();
		for(Integer i:qz){
			System.out.print(i+" ");
		}	
	}

	static int sumQueue(Queue<Integer> qz){
		int sum=0;
		// no backup queue required
		for(Integer i:qz){
			sum += i;
		}
		return sum;			
	}

	static void removeFrom(Queue<Integer> qz, int rm){
		int qsz = qz.size();
		for(int i=0; i<qsz; i++){
			int n=qz.remove();
			if(n!=rm)
				qz.add(n);
		}
		System.out.println("\nRemoved "+rm+"!");
	}
}