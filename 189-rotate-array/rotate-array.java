class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        // reverse(nums,n-k,n-1);
        // reverse(nums,0,n-k-1);
        // reverse(nums,0,n-1);

        int[] ans=new int[k];

        for(int i=0;i<k;i++)
        {
            ans[i]=nums[n-k+i];
        }
        int j=n-1;

        for(int i=n-k-1;i>=0;i--)
        {
            nums[j]=nums[i];
            j--;
        }

        for(int i=0;i<k;i++)
        {
            nums[i]=ans[i];
        }
    }

    // public void reverse(int[] nums,int start,int end)
    // {
    //     while(start<end)
    //     {
    //         int temp=nums[start];
    //         nums[start]=nums[end];
    //         nums[end]=temp;
    //         start++;
    //         end--;
    //     }
    // }
} 