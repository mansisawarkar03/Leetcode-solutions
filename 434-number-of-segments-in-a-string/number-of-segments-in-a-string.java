class Solution {
    public int countSegments(String s) {

        if(s.length()==0 || s==null)
        {
            return 0;
        }
        int count=0;

        for(int i=1;i<s.length();i++)
        {
            char prev=s.charAt(i-1);
            char cur=s.charAt(i);

            if(cur!=' ' && prev==' ')
            {
                count++;
            }


        }

        if(s.charAt(0)!=' ')
        {
            count++;
        }
        return count;
        
    }
}