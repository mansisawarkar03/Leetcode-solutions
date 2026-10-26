class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> v=new HashMap<>();
        HashMap<Character,Integer> c=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                v.put(ch,v.getOrDefault(ch,0)+1);
            }
            else
            {
                c.put(ch, c.getOrDefault(ch,0)+1);
            }
        }

        int maxv=0;
        int maxc=0;

        for(int i:v.values())
        {
            maxv=Math.max(maxv,i);
        }
        for(int i:c.values())
        {
            maxc=Math.max(maxc,i);
        }
        return maxc+maxv;
        
    }
}