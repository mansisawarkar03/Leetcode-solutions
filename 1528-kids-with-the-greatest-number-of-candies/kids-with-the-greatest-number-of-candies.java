class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans=new ArrayList<>();
        int max=0;
        for(int c: candies)
        {
            max=Math.max(c,max);
        }

        for(int c: candies)
        {
            int n= c + extraCandies;
            if(n>=max)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }

        return ans;
    }
}