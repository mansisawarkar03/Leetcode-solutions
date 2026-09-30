class Solution {
    public int firstUniqueEven(int[] nums) {

        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int ans=-1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue()==1 && entry.getKey()%2==0)
            {
                return entry.getKey();
            }
        }
        return ans;
    }
}