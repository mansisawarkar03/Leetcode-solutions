class Solution {
    public int residuePrefixes(String s) {
        
        Set<Character> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            set.add(ch);
            if(set.size()==(i+1)%3) ans++;
        }
        return ans;
    }
}