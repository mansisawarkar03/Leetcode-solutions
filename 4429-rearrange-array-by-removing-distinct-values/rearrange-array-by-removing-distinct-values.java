class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new TreeSet<>();
        for(int i:nums)
        {
            set.add(i);
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans=new int[nums.length];
        int i=0;
        while(i<nums.length)
        {
            for(int n:set)
            {
                if(map.get(n)>0)
                {
                    ans[i++]=n;
                    map.put(n,map.get(n)-1);
                }
            }
        }
        return ans;
    }
}