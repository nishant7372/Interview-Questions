package kadaneAlgorithm;

public class MaxSubarraySum {

	int[] nums;
	public MaxSubarraySum(int[] nums)
	{
		this.nums=nums;
	}
	
	public int calculateSum()
	{
		int sum=0;
		int max=0;
		for(int x:nums)
		{
			sum+=x;
			if(sum<0)
				sum=0;
			if(max<sum)
				max=sum;
		}
		return max;
	}
}
