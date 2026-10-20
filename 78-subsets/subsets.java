class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        set(0,nums,nums.length,cur,ans);
        return ans;


        
    }

    void set(int i, int[] nums,int n,List<Integer> cur,List<List<Integer>> ans)
    {
        if(i==n)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        set(i+1,nums,n,cur,ans);
        cur.remove(cur.size()-1);
        set(i+1,nums,n,cur,ans);
    }
}