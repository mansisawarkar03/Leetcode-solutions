class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int count=0;
        int max=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='L' || moves.charAt(i)=='_')
                count++;
            else
                count--;
        }
        max=count;
        count=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='R' || moves.charAt(i)=='_')
                count++;
            else
                count--;
        }
        return Math.max(max,count);
        
    }
}