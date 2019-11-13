import java.util.*;

public class postfix {
	public static void main(String[] args){
		Character[] expression = {'5','2','4','*','+','7','-'};
		Queue<Character> exp = new LinkedList<>();
		Stack<Character> st = new Stack<>();
		
		for(Character c:expression)
			exp.add(c);
		
		for(Character o:exp){
			if(Character.isDigit(o))
				st.push(o);
			else
				st.push(eval(st, o));
		}
		
		if(!st.isEmpty())
			System.out.println("answer is: "+ st.pop());
	}

	static Character eval(Stack<Character> stk, char c){
		if(c=='-')
			return ((int)stk.pop() - (int)stk.pop());
		else if(c=='+')
			return ((int)stk.pop() + (int)stk.pop());
		else if(c=='*')
			return ((int)stk.pop() * (int)stk.pop());
		else if(c=='/')
			return ((int)stk.pop() / (int)stk.pop());
	}
}