class Solution {
    public boolean judgeCircle(String moves) {
        int ud=0;
        int lr=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            switch(ch)
            {
                case 'U':
                    ud++;
                    break;
                
                case 'D':
                    ud--;
                    break;

                case 'R':
                    lr++;
                    break;
                
                case 'L':
                    lr--;
                    break;
            }
        }
        if(lr==0 && ud==0)
            return true;
        
        return false;
        
    }
}