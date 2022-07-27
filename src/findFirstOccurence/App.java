package findFirstOccurence;

public class App {

	public static void main(String[] args)
	{
		int[] nums= {5,7,7,8,8,10};
		FindFirstOccurence findFirstOccurence = new FindFirstOccurence(nums);
		System.out.println(findFirstOccurence.search(6));
	}
}
