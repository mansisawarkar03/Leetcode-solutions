class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> map=new HashMap<>();

        String[] a=s.split(" ");

        if(pattern.length()!=a.length)
        {
            return false;
        }

        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String m=a[i];

            if(map.containsKey(ch) && !map.get(ch).equals(m))
            {
                return false;
            }
            if(!map.containsKey(ch) && map.containsValue(m))
            {
                return false;
            }
            map.put(ch,m);
        }

        return true;
        
    }
}