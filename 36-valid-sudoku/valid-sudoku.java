class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        int r=board.length;
        int c=board[0].length;

        for(int i=0;i<r;i++)
        {
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<c;j++)
            {
                char ch=board[i][j];
                if(set.contains(ch) && ch!='.')
                {
                    return false;
                }
                if(ch!='.')
                {
                    set.add(ch);
                }
                
            }
        }

        for(int j=0;j<c;j++)
        {
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<r;i++)
            {
                char ch=board[i][j];
                if(set.contains(ch) && ch!='.')
                {
                    return false;
                }
                if(ch!='.')
                {
                    set.add(ch);
                }
            }
        }

        for(int i=0;i<r;i+=3)
        {
            for(int j=0;j<c;j+=3)
            {
                HashSet<Character> set=new HashSet<>();

                for(int x=i;x<i+3;x++)
                {
                    for(int y=j;y<j+3;y++)
                    {
                        char ch=board[x][y];
                        if(set.contains(ch) && ch!='.')
                        {
                            return false;
                        }
                        if(ch!='.')
                        {
                            set.add(ch);
                        }
                    }
                }
            }
        }

        return true;
    }
}