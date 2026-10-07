class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        int ans=0;
        for(int i=0;i<words1.length;i++)
        {
            String s=words1[i];
            map1.put(s, map1.getOrDefault(s,0)+1);
        }
        for(int i=0;i<words2.length;i++)
        {
            String s=words2[i];
            map2.put(s, map2.getOrDefault(s,0)+1);
        }
        for(int i=0;i<words1.length;i++)
        {
            String s=words1[i];
            if(map2.containsKey(s) && map2.get(s)==1 && map1.get(s)==1)
            {
                ans++;
            }
            
        }
        return ans;

    }
}