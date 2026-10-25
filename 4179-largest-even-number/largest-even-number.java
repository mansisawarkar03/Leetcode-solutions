class Solution {
    public String largestEven(String s) {

        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!='2') count++;
            else break;
        }
        return s.substring(0,s.length()-count);

        
    }
}