class Solution {
    public int vowelConsonantScore(String s) {

        int c=0;
        int v=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') v++;
            else if(Character.isLetter(ch)) c++;
        }

        if(c>0) return (int)Math.floor(v/c);

        return 0;
        
    }
}