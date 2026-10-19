class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int k=-1;
                if(board[i][j]==1)
                {
                    k=live(board,i,j);
                }
                else
                {
                    k=die(board,i,j);
                }
                board[i][j]=k;
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==2)
                {
                    board[i][j]=0;
                }
                else if(board[i][j]==3)
                {
                    board[i][j]=1;
                }
            }
        }
        
    }

    int live(int[][] board,int i,int j)
    {
        int count=0;
        for(int k=i-1;k<=i+1;k++)
        {
            for(int l=j-1;l<=j+1;l++)
            {
                if (k == i && l == j) {
                    continue;
                }
                if(k>=0 && l>=0 && k<board.length && l<board[0].length)
                {
                    if(board[k][l]==1 || board[k][l]==2)
                    {
                        count++;
                    }
                }
            }
        }
        if(count<2 || count>3)
        {
            return 2;
        }
        else if(count==2 || count==3)
        {
            return 1;
        }
        return 1;

    }

    int die(int[][] board,int i,int j)
    {
        int count=0;
        for(int k=i-1;k<=i+1;k++)
        {
            for(int l=j-1;l<=j+1;l++)
            {
                if (k == i && l == j) {
                    continue;
                }
                if(k>=0 && l>=0 && k<board.length && l<board[0].length)
                {
                    if(board[k][l]==1 || board[k][l]==2)
                    {
                        count++;
                    }
                }
            }
        }
        if(count==3)
        {
            return 3;
        }
        
        return 0;

    }

}