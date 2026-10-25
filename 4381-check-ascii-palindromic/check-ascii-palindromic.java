class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray())
        {
            int n=(int)ch;
            sb.append(String.format("%8s",Integer.toBinaryString(n)).replace(' ','0'));
        }

        int left=0;
        int right=sb.length()-1;
        while(left<right)
        {
            if(sb.charAt(left)!=sb.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
        
    }
}