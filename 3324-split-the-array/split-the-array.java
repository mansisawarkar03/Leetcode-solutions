class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        // int[] nums1=new int[n/2];
        // int[] nums2=new int[n/2];

        // Arrays.sort(nums);
        // int k=0;
        // for(int i=0;i<nums.length/2;i++)
        // {
        //     nums1[i]=nums[k++];
        //     nums2[i]=nums[k++];

        // }

        // if(!Arrays.equals(nums1,nums2))
        // {
        //     return true;
        // }
        // return false;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int j: nums)
        {
            if(map.get(j)>2)
            {
                return false;
            }
        }

        return true;

    }
}