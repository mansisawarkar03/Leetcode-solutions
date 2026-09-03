class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();

        for(String s: strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String m=new String(ch);

            if(!map.containsKey(m))
            {
                map.put(m,new ArrayList<>());
            }
            map.get(m).add(s);
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet())
        {
            ans.add(entry.getValue());
        }

        return ans;
        
    }
}