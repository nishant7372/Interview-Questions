package twoStacksin1Array;

public class TwoStacks {

	int[] array;
	int[] top;
	public TwoStacks(int[] array,int[] top)
	{
		this.array = array;
		this.top=top;
	}
	
	public void push(int a,int choice)
	{
		if(choice==1&&top[0]!=top[1])
		{
			array[top[0]++]=a;
		}
		else if(choice==2&&top[0]!=top[1])
		{
			array[top[1]--]=a;
		}
		else
		{
			System.out.println("Memory Overflow!!!");
		}
		display();
	}

	public int pop(int choice)
	{
		int res=-1;
		if(choice==1)
		{
			if(top[0]==0)
				System.out.println("Stack1 UnderFlow");
			else
				res= array[--top[0]];
		}
		else if(choice==2)
		{
			if(top[1]==array.length-1)
				System.out.println("Stack2 UnderFlow");
			else
				res= array[++top[1]];
		}
		display();
		return res;
	}
	
	private void display()
	{
		for(int i=0;i<top[0];i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
		for(int i=array.length-1;i>top[1];i--)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
	}
}
