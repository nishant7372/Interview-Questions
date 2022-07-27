package twoStacksin1Array;

public class App {

	public static void main(String[] args)
	{
		int[] array = new int[10];
		int[] top = {0,array.length-1};
		TwoStacks st = new TwoStacks(array,top);
		st.push(10, 1);
		st.push(20, 1);
		st.push(70, 2);
		st.push(80, 2);
		st.push(30, 1);
		st.push(90, 2);
		st.push(10, 1);
		st.push(20, 1);
		st.push(70, 2);
		st.push(80, 2);
		st.push(30, 1);
		st.push(90, 2);
		st.pop(1);
		st.pop(1);
		st.pop(2);
		st.pop(1);
		st.pop(1);
		st.pop(2);
		st.pop(1);
		st.pop(1);
		st.pop(2);
		st.pop(1);
		st.pop(1);
		st.pop(2);
	}
}
