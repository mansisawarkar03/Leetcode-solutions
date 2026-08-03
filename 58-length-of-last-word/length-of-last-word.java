class Solution {
    public int lengthOfLastWord(String s) {
        // s=(Arrays.toString(s.split(" ")));
        int word=0,length=s.length()-1;
        while(length>=0 && s.charAt(length)==' ')
        {
            length--;
        }
        while(length>=0 && s.charAt(length)!=' ')
        {
            word++;
            length--;
        }
        return word;
    }
}