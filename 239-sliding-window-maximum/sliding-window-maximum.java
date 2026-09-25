class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] ans=new int[nums.length-k+1];
        int l=0;
        int i=0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        //List<Integer> list=new ArrayList<>();
        for(int r=0;r<nums.length;r++)
        {
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);
            if(r-l+1==k)
            {
                ans[i]=map.lastKey();
                i++;
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {
                    map.remove(nums[l]);
                }
                l++;
            }
            
            //if()
        }
        return ans;
        
    }
}