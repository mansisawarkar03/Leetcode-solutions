class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left=0;
        double ans=Double.NEGATIVE_INFINITY;
        double sum=0;

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(i-left+1==k)
            {
                double a=sum/k;
                ans=Math.max(ans,a);
                sum-=nums[left];
                left++;
            }
            
        }

        return ans;
        
    }
}