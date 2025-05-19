package arraylistdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stk= new Stack<String>();
		
		stk.add("ele1");
		stk.add("ele2");
		stk.add("ele3");
		stk.add("ele3");
		stk.add("null");
		
		System.out.println(stk);
		System.out.println(stk.capacity());
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		
	}

}
