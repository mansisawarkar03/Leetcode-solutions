class Solution {
    public int minimumChairs(String s) {

        int occupied=0;
        int maxchair=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='E')
            {
                occupied++;
                maxchair=Math.max(maxchair,occupied);
            }
            else
            {
                occupied--;
            }
        }
        return maxchair;
        
    }
}