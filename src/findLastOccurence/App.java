package findLastOccurence;

public class App {

	public static void main(String[] args)
	{
		int[] nums= {5,7,7,8,8,10};
		FindLastOccurence findLastOccurence = new FindLastOccurence(nums);
		System.out.println(findLastOccurence.search(9));
	}
}
