class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        int p=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            p+=nums[i];
            int c=p-goal;
            if(map.containsKey(c))
            {
                ans+=map.get(c);
            }
            map.put(p,map.getOrDefault(p,0)+1);
        }
        return ans;
        
    }
}