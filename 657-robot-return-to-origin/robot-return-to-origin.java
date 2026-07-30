class Solution {
    public boolean judgeCircle(String moves) {
        int ud=0;
        int lr=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='L')
                lr--;
            else if(ch=='R')
                lr++;
            else if(ch=='U')
                ud++;
            else
                ud--;
            
        }
        if(lr==0 && ud==0)
            return true;
        
        return false;
        
    }
}