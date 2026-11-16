class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans=0;
        for(String s:words)
        {
            if(s.length()>=pref.length())
            {
                if(pref.equals(s.substring(0,pref.length()))) ans++;
            }
            
        }
        return ans;
        
    }
}