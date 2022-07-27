package kadaneAlgorithm;

public class App {

	public static void main(String[] args)
	{
		int[] nums = {2,-1,3,9,-56,8,-3,-9,20,3,-8};
		MaxSubarraySum maxSubArraySum= new MaxSubarraySum(nums);
		System.out.println(maxSubArraySum.calculateSum());
	}
}
