class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder();
        
        if(k>=1 && k<=s.length())
        {
            for(int i=k-1;i>=0;i--)
            {
                sb.append(s.charAt(i));
            }
        }
        if(k<s.length())
        {
            for(int i=k;i<s.length();i++)
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}