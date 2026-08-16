class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            int flag=0;
            String s=words[i];
            int j=0;
            int n=s.length()-1;
            if(s.length()==1)
            {
                return s;
            }
            while(j<n)
            {
                if(s.charAt(j)!=s.charAt(n))
                {
                    flag=0;
                    break;
                }
                else
                {
                    flag=1;
                    j++;
                    n--;
                }
            }
            if(flag==1)
            {
                return s;
            }

        }
        return new String();
        
    }
}