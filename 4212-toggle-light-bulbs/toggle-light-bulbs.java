class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        

        TreeMap<Integer,Integer> map=new TreeMap<>();

        for(int i: bulbs)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry :map.entrySet())
        {
            if(entry.getValue() % 2 !=0)
            {
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}