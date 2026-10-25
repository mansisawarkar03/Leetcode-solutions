class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {

        for(int i=0;i<s.length()-1;i++)
        {
            int m=(int)s.charAt(i);
            int n=(int)s.charAt(i+1);
            if(Math.abs(m-n)>2) return false;
        }
        return true;
        
    }
}