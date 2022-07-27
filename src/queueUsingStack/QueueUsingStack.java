package queueUsingStack;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> st;
	public QueueUsingStack(Stack<Integer> st)
	{
		this.st=st;
	}
	
	public void push(int a)
	{
		st.push(a);
	}
	
	public int pop()
	{
		if(st.size()==1)
			return st.pop();
		int a = st.pop();
		int res = pop();
		st.push(a);
		return res;
	}
}
