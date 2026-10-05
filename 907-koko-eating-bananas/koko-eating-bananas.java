class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int p:piles)
        {
            high=Math.max(high,p);
        }
        int ans=high;
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int hours=0;
            for(int i:piles)
            {
                hours+=Math.ceil((double)i/mid);
            }
            if(hours<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return ans;
    }
}