class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public static boolean solve(char[][] board)
    {
         for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(isvalid(i,j,c,board))
                        {
                            board[i][j]=c;
                            if(solve(board)==true)
                            return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isvalid(int row,int col,char c,char[][] board)
    {
        for(int x=0;x<9;x++)
        {
            if(board[row][x]==c)
            return false;
            if(board[x][col]==c)
            return false;
            if(board[3*(row/3)+x/3][3*(col/3)+x%3]==c)
            return false;
        }
        return true;
    }
}