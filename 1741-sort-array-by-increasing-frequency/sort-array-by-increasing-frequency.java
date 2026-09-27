class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);

        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>();
        list.addAll(map.entrySet());

        Collections.sort(list,Comparator.comparingInt((Map.Entry<Integer, Integer> e) -> e.getValue()).thenComparing(Map.Entry::getKey,Comparator.reverseOrder()));
        int k=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<list.size();i++)
        {
            Map.Entry<Integer,Integer> entry=list.get(i);
            for(int j=0;j<entry.getValue();j++)
            {
                ans[k]=entry.getKey();
                k++;
            }
        }
        return ans;
    }
}