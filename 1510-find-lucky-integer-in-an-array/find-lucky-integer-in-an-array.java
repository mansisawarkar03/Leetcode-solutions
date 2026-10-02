class Solution {
    public int findLucky(int[] arr) {

        int[] nums=new int[501];
        int ans=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            nums[arr[i]]++;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(i==nums[i])
            {
                ans=nums[i];
            }
        }
        return ans;
        
    }
}