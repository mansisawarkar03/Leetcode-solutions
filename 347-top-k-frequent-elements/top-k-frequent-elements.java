class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n: nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>();

        list.addAll(map.entrySet());
        list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));

        for(int i=0;i<k;i++)
        {
            Map.Entry<Integer,Integer> entry=list.get(i);
            ans[i]=entry.getKey();
        }

        return ans;

        
        
    }
}