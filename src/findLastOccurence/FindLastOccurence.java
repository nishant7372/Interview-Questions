package findLastOccurence;

public class FindLastOccurence {
	    int[] nums;
		public FindLastOccurence(int[] nums)
		{
			this.nums=nums;
		}
		
		public int search(int target) {
			int start=0;
			int end=nums.length-1;
			
			while(start<=end)
			{
				int mid = (start+end)/2;
				if(nums[mid]>target)
					end=mid-1;
				else
					start=mid+1;
			}
			if(end>=0&&nums[end]!=target)
				return end+1;
			return end;
		}
}
