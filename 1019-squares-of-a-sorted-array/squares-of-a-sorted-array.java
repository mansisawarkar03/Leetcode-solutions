class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] ans=new int[nums.length];

        int n=nums.length;
        int left=0;
        int right=n-1;
        int pos=n-1;

        while(left<=right)
        {
            int leftval=nums[left]*nums[left];
            int rightval=nums[right]*nums[right];

            if(leftval>rightval)
            {
                ans[pos]=leftval;
                left++;
            }
            else
            {
                ans[pos]=rightval;
                right--;

            }
            pos--;
        }

        return ans;

    }
}