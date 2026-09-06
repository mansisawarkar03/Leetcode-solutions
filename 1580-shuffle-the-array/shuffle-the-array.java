class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] a1=new int[n];
        int[] a2=new int[n];

        for(int i=0;i<n;i++)
        {
            a1[i]=nums[i];
            a2[i]=nums[n+i];
        }
        int k=0;
        for(int i=0;i<n;i++)
        {
            nums[k]=a1[i];
            k++;
            nums[k]=a2[i];
            k++;
        }

        return nums;
    }
}