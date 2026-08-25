class Solution {
    public int missingMultiple(int[] nums, int k) {

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
        int i=1;
        int l=k;
        while(l>0)
        {
            if(!list.contains(l))
            {
                return l;
            }
            l=k*i;
            i++;
        }
        return k;
        
        
    }
}