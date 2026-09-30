class Solution {
    public int[] minDistinctFreqPair(int[] nums) {

        Arrays.sort(nums);
        int[] ans=new int[2];

        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i:nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
         
        
        int f=0;
        boolean first=true;
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(first)
            {
                f=entry.getValue();
                ans[0]=entry.getKey();
                first=false;
            }
            else if(f!=entry.getValue())
            {
                ans[1]=entry.getKey();
                return ans;
            }
        }
        return new int[]{-1,-1};
    }
}