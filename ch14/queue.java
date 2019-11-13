import java.util.*;

public class queue{
	public static void main(String[] args){
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> b = new LinkedList<Integer>();

		Integer[] intArr = new Integer[5];
		int arrLen = intArr.length;

		Scanner console = new Scanner(System.in);

		// read in array		
		System.out.println("enter "+arrLen+" integers");
		for(int i=0; i<arrLen; i++){
			intArr[i] = console.nextInt();
		}
		System.out.println("\nArray contents: "+Arrays.toString(intArr));

		// load our queue
		for(Integer i : intArr)
			q.add(i);
		
		System.out.println("\nQueue Contents:\n");
		
		// view and store queue elements
		// with for loop
		int qsz = q.size();
		for(int i=0; i<qsz; i++){
			System.out.print(q.peek()+" ");
			b.add(q.remove());
		}
		System.out.println();
		
		// restore original queue
		while(!b.isEmpty()){
			q.add(b.remove());		
		}

		System.out.println("\nMaximum value in queue: "+ findMax(q));	
	}

	static int findMax(Queue<Integer> qz){
		Queue<Integer> bkp = new LinkedList<>();
		int maxVal = qz.peek();
		while(!qz.isEmpty()){
			if(qz.peek()>maxVal)
				maxVal = qz.peek();
			bkp.add(qz.remove());
		}
		//reload and return
		while(!bkp.isEmpty()){
			qz.add(bkp.remove());
		}
		return maxVal;
	}		
}	