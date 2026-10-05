class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        int ans=Integer.MAX_VALUE;
        
        
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        long rem=sum%p;
        if(rem==0)
        {
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int pre=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            pre=(pre+nums[i])%p;
            int c=(int)(pre-rem+p)%p;
            if(map.containsKey(c))
            {
                ans=Math.min(ans,i-map.get(c));
            }
            map.put(pre,i);
        }
        if(ans==Integer.MAX_VALUE || ans==nums.length)
        {
            return -1;
        }
        return ans;



        
    }
}