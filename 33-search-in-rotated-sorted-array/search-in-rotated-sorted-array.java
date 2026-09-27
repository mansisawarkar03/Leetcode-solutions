class Solution {
    public int search(int[] nums, int target) {

        int low=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                low=i;
            }
        }
        int l1=0;
        int h1=low-1;
        while(l1<=h1)
        {
            int mid=l1+(h1-l1)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                l1=mid+1;
            }
            else
            {
                h1=mid-1;
            }
        }

        int l2=low;
        int h2=nums.length-1;
        while(l2<=h2)
        {
            int mid=l2+(h2-l2)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                l2=mid+1;
            }
            else
            {
                h2=mid-1;
            }
        }
        return -1;
        
    }
}