class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int m=1;
        while(left<=right && top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                ans[top][i]=m++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                ans[i][right]=m++;
            }
            right--;
            if(left<=right)
            {
                for(int i=right;i>=left;i--)
                {
                    ans[bottom][i]=m++;
                }
                bottom--;
            }
            if(top<=bottom)
            {
                for(int i=bottom;i>=top;i--)
                {
                    ans[i][left]=m++;
                }
                left++;
            }
        }

        return ans;
        
    }
}