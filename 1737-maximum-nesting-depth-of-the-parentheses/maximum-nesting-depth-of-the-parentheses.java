class Solution {
    public int maxDepth(String s) {
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                c++;
                ans=Math.max(c,ans);
                
            }
            else if(s.charAt(i)==')')
            {
                c--;
            }

        }
        return ans;
        
    }
}