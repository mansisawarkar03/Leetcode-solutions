class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch: s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>();

        list.addAll(map.entrySet());

        list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<list.size();i++)
        {
            Map.Entry<Character,Integer> entry=list.get(i);
            for(int j=0;j<entry.getValue();j++)
            {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
        
    }
}