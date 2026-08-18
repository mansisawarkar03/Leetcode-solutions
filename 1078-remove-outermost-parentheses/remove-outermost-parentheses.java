class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        int start = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                if(count==0) start=i;

                count++;
            
            }
            else
            {
                count--;
            }

            if(count==0)
            {
                for(int j=start+1;j<i;j++)
                {
                    sb.append(s.charAt(j));
                }
            }
        }

        return sb.toString();

    }
}