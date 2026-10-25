class Solution {
    public boolean scoreBalance(String s) {
        int t=0;
        for(char ch:s.toCharArray())
        {
            t+=ch-'a'+1;
        }
        int left=0;
        for(int i=0;i<s.length();i++)
        {
            left+=s.charAt(i)-'a'+1;
            int right=t-left;
            if(left==right) return true;
        }
        return false;
    }
}