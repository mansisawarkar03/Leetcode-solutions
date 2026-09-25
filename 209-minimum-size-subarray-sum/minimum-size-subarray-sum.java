class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int ans=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        int flag=0;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                ans=Math.min(ans,r-l+1);
                sum-=nums[l];
                l++;
                flag=1;
            }
        }

        if(flag==1)
        {
            return ans;
        }
        return 0;
        
    }
}