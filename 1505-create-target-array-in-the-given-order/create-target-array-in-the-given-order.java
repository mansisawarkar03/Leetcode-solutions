class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        int n=nums.length;

        int[] t=new int[n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>index[i];j--)
            {
                t[j]=t[j-1];
            }
            t[index[i]]=nums[i];
            
        }

        

        return t;
        
    }
}