class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]>nums[(i+1)%l])
            {
                count++;
            }
            if(count>1)
                return false;
        }
        return true;
        
    }
}