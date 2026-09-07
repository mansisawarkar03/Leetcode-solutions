class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans=new int[nums.length];
        int p=1;
        int q=0;
        for(int n: nums)
        {
            if(n!=0)
            {
                p=p*n;
            }
            else
            {
                q++;
            }
            
        }

        for(int i=0;i<nums.length;i++)
        {
            if(q>1)
            {
                ans[i]=0;
            }
            else if(q==1)
            {
                if(nums[i]==0)
                {
                    ans[i]=p;
                }
                else
                {
                    ans[i]=0;
                }
            }
            else
            {
                ans[i]=p/nums[i];
            }
            
        }
        return ans;
    }
}