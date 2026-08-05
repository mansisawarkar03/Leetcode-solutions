class Solution {
    public int minOperations(List<Integer> nums, int k) {

        List<Integer> list=new ArrayList<>();
        int ans=0;

        for(int i=1;i<=k;i++)
        {
            list.add(i);
        }

        for(int i=nums.size()-1;i>=0;i--)
        {
            if(list.isEmpty())
                return ans;
                
            if(list.contains(nums.get(i)))
            {
                list.remove(nums.get(i));
                ans++;
            }
            else
            {
                ans++;
            }
        }

        return ans;
        
    }
}