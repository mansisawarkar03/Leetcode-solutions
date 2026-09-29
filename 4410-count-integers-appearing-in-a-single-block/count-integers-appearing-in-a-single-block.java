class Solution {
    public int countSpecialIntegers(int[] nums) {

        int ans=0;
        int[] a=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0 || nums[i]!=nums[i-1])
            {
                a[nums[i]]++;
            }

        }
        for(int x:a)
        {
            if(x==1)
            {
                ans++;
            }
        }
        return ans;
    }
}