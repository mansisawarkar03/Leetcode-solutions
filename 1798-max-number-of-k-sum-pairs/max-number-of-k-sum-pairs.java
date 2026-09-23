class Solution {
    public int maxOperations(int[] nums, int k) {

   
        int n=nums.length;
        int ans=0;

        Arrays.sort(nums);
        int l=0;
        int r=n-1;

        while(l<r)
        {
            if(nums[r]+nums[l]==k)
            {
                ans++;
                r--;
                l++;
            }
            else if(nums[r]+nums[l]<k)
            {
                l++;
            }
            else
            {
                r--;
            }
        }

        return ans;
        
    }
}