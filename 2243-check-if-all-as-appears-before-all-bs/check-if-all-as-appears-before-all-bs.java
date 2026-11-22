class Solution {
    public boolean checkString(String s) {
        

        int i=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b') break;
        }
        for(int j=i;j<s.length();j++)
        {
            if(s.charAt(j)=='a') return false;
        }
        return true;
    }
}