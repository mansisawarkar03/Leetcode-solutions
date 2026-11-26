class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        boolean a=true;

        while(n>=remove)
        {
            n-=remove;
            remove--;
            if(a==true)
            {
                a=false;
            }
            else
            {
                a=true;
            }
        }
        if(a==false)
        {
            return true;
        }
        return false;
    }
}