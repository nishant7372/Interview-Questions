package Reverse_Stack;

import java.util.Stack;

public class ReverseStack {
    Stack<Integer> st;
    
	public ReverseStack(Stack<Integer> st)
	{
		this.st = st;
	}
	
	public void reverse()
	{
		if(st.size()==0)
			return;
		int a = st.pop();
		reverse();
		insertAtBottom(a);
	}
	
	private void insertAtBottom(int a)
	{
		if(st.size()==0)
		{
			st.push(a);
			return;
		}
		int b = st.pop();
		insertAtBottom(a);
		st.push(b);
	}
	
}
