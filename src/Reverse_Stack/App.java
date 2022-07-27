package Reverse_Stack;

import java.util.Stack;

public class App {

	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println("Initial:" + st);
		ReverseStack reverseStack = new ReverseStack(st);
		reverseStack.reverse();
		System.out.println("Final:" + st);
	}
}
