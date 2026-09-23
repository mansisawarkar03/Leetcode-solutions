class Solution {
    public void moveZeroes(int[] nums) {
        // int j=-1;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0)
        //     {
        //         j=i;
        //         break;
        //     }
        // }
        // if(j!=-1)
        // {
        //     for(int i=j+1;i<nums.length;i++)
        //     {
        //         if(nums[i]!=0)
        //         {
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //             j++;
        //         }
        //     }
        // }



        int l=0;
        int n=nums.length;

        for(int r=0;r<n;r++)
        {
            if(nums[r]!=0)
            {
                int temp=nums[r];
                nums[r]=nums[l];
                nums[l]=temp;
                l++;
            }
        }



        
    }
}