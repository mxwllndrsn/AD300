import java.util.*;

public class peeking{
	public static void main(String[] args){
		Stack<Integer> stack_one = new Stack<Integer>();
		Stack<Integer> stack_two = new Stack<>();
		Integer[] intArr = new Integer[5];
		int arrLen = intArr.length;

		Scanner console = new Scanner(System.in);

		// read in array		
		System.out.println("enter "+arrLen+" integers");
		for(int i=0; i<arrLen; i++){
			intArr[i] = console.nextInt();
		}
		System.out.println("\nArray contents: "+Arrays.toString(intArr));

		// push array into stack
		for(Integer i : intArr){
			stack_one.push(i);
		}

		System.out.println("\nstack contents\n");

		// display and swap stacks
		while(!stack_one.isEmpty()){
			System.out.format("| %-3d |\n-------\n", stack_one.peek());
			stack_two.push(stack_one.pop());	
		}

		while(!stack_two.isEmpty()){
			stack_one.push(stack_two.pop());
		}

		System.out.println("\nMaximum value in the stack: "+findMax(stack_one));
	}

	static int findMax(Stack<Integer> st){
		Stack<Integer> bk = new Stack<>();
		int maxVal = st.peek();
		while(!st.isEmpty()){
			if(st.peek()>maxVal){
				maxVal = st.peek();
			}
			bk.push(st.pop());
		}
		while(!bk.isEmpty()){
			st.push(bk.pop());
		}
		return maxVal;
	}		
}