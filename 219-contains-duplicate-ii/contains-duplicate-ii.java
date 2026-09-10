class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,List<Integer>> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        for(int i=0;i<nums.length;i++)
        {
            List<Integer> list=map.get(nums[i]);
            for(int j=1;j<list.size();j++)
            {
                if(Math.abs(list.get(j)-list.get(j-1))<=k)
                {
                    return true;
                }
            }
            
        }
        return false;
        
    }
}