class Solution {
    public int majorityElement(int[] nums) {
        // int count=0;
        // int candidate=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(count==0)
        //         candidate=nums[i];
        //     if(nums[i]==candidate)
        //         count++;
        //     if(nums[i]!=candidate)
        //         count--;
        // }
        // return candidate;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>nums.length/2) return entry.getKey();
        }
        return -1;
    }
}