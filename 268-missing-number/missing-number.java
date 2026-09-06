class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x=0;
        int sum1=0;
        int sum=n*(n+1)/2;
        // for(int i=0;i<nums.length;i++)
        // {
        //     x=x^i^i;
        // }
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
        }
        return sum-sum1;
        
    }
}