class Solution {
    public int minimumPushes(String word) {
        int n= word.length();

        if(n<=8)
        {
            return n;
        }
        else if(9<=n && n<=16)
        {
            return (8+(n-8)*2);
        }
        else if(17<=n && n<=24)
        {
            return (24+(n-16)*3);
        }
        else
            return (48+(n-24)*4);

        
    }
}