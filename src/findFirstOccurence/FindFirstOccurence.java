package findFirstOccurence;

public class FindFirstOccurence {
    int[] nums;
	public FindFirstOccurence(int[] nums)
	{
		this.nums=nums;
	}
	
	public int search(int target) {
		int start=0;
		int end=nums.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(nums[mid]<target)
				start=mid+1;
			else
				end=mid-1;
		}
		return start;
	}
}
