class Solution {
    public int longestPalindrome(String s) {

        if(s.length()==1)
        {
            return 1;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans=0;
        for(int i:map.values())
        {
           ans+=(i/2)*2;
        }
        if(ans<s.length()) ans++;

        return ans;
        
        
    }
}