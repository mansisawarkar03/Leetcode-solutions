class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        
        for(char c:stones.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char ch:jewels.toCharArray())
        {
            if(map.containsKey(ch))
            {
                ans+=map.get(ch);
                map.remove(ch);
            }

        }
        return ans;
        
    }
}