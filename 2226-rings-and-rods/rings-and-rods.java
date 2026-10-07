class Solution {
    public int countPoints(String rings) {
        HashMap<Character,Set<Character>> map=new HashMap<>();
        for(int i=0;i<rings.length()-1;i++)
        {
            char ch=rings.charAt(i);
            char n=rings.charAt(i+1);
            if(!map.containsKey(n))
            {
                map.put(n,new HashSet<>());
            }
            map.get(n).add(ch);
            i++;

        }
        int ans=0;
        for(Set<Character> set:map.values())
        {
            if(set.size()==3)
            {
                ans++;
            }
        }
        return ans;

        
    }
}