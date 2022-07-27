package queueUsingStack;

import java.util.Stack;

public class App {

	public static void main(String[] args)
	{
	Stack<Integer> st = new Stack<Integer>();
	QueueUsingStack queue = new QueueUsingStack(st);
	
	queue.push(10);
	System.out.println(st);
	queue.push(20);
	System.out.println(st);
	queue.push(30);
	System.out.println(st);
	queue.push(40);
	System.out.println(st);
	queue.push(50);
	System.out.println(st);
	queue.pop();
	System.out.println(st);
	queue.push(70);
	System.out.println(st);
	queue.push(80);
	System.out.println(st);
	queue.pop();
	System.out.println(st);
	queue.push(20);
	System.out.println(st);
	}
}
