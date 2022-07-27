package generateBinary;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GenerateBinary {
    int n;
    ArrayDeque<String> queue;
    ArrayList<String> res;
	public GenerateBinary(int n,ArrayList<String> res)
	{
		this.queue = new ArrayDeque<String>();
		this.res= res;
		this.n=n;
	}
	
	public void generate()
	{
		res.add("0");
		res.add("1");
		queue.add("1");
		while(res.size()<n)
		{
			String x = queue.pop();
			String y=x;
			res.add(x+'0');
			queue.add(x+'0');
			res.add(y+'1');
			queue.add(y+'1');
		}
	}
}
