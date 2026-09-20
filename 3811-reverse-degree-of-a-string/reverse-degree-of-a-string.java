class Solution {
    public int reverseDegree(String s) {
        int ans=0;

        for(int i=0;i<s.length();i++)
        {
            int ind=i+1;
            char ch=s.charAt(i);
            int r=26-(ch-'a');
            int p=ind*r;
            ans+=p;
        }

        return ans;
        
    }
}