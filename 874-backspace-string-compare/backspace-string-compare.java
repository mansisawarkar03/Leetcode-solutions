class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb=new StringBuilder();
        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            if(ch=='#')
            {
                if(sb.length()>0)
                {
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else
            {
                sb.append(ch);
            }
        }


        StringBuilder sb1=new StringBuilder();
        for(int r=0;r<t.length();r++)
        {
            char ch=t.charAt(r);
            if(ch=='#')
            {
                if(sb1.length()>0)
                {
                    sb1.deleteCharAt(sb1.length()-1);
                }
            }
            else
            {
                sb1.append(ch);
            }
        }
        return sb.toString().equals(sb1.toString());
        
    }
}