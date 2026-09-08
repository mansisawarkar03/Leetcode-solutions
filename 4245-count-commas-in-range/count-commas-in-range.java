class Solution {
    public int countCommas(int n) {

        int num=n;
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        if(count<=3)
        {
            return 0;
        }
        else if(count==4)
        {
            return (n-1000)+1;
        }
        else if(count==5)
        {
            return 9000 + (n-10000)+1;
        }
        
        return 99000 + (n-100000)+1;
        
        
    }
}