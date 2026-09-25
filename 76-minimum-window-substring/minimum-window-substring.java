class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length())
        {
            return "";
        }
        HashMap<Character,Integer> s1=new HashMap<>();
        HashMap<Character,Integer> t1=new HashMap<>();
        for(char ch: t.toCharArray())
        {
            t1.put(ch, t1.getOrDefault(ch,0)+1);
        }

        int l=0;
        int formed=0;

        int minlen=Integer.MAX_VALUE;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            s1.put(ch,s1.getOrDefault(ch,0)+1);

            if(t1.containsKey(ch) && t1.get(ch).equals(s1.get(ch)))
            {
                formed++;
            }

            while(formed==t1.size())
            {
                if(i-l+1<minlen)
                {
                    minlen=i-l+1;
                    start=l;
                }

                char c=s.charAt(l);
                if(t1.containsKey(c) && s1.get(c).equals(t1.get(c)))
                {
                    formed--;
                }
                s1.put(c,s1.get(c)-1);
                l++;
            }

        }

        if(minlen==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(start,start+minlen);

        
    }
}