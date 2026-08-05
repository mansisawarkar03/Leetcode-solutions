class Solution {
    public int minOperations(int[] nums) {

        int ans=0;

        if(nums.length==1)
            return ans;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]<=nums[i])
            {
                int count=nums[i]-nums[i+1]+1;
                nums[i+1]=count+nums[i+1];
                ans+=count;

            }
        }
        return ans;
        
    }
}