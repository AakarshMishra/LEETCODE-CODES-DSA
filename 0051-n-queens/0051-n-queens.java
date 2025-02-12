class Solution {
    public List<List<String>> solveNQueens(int n) {
        int up[]=new int[2*n-1];
        int down[]=new int[2*n-1];
        int left[]=new int[n];
        String[][] board= new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]=".";
            }
        }
        List<List<String>> ans=new ArrayList<>();
        solve(0,n,up,down,left,board,ans);
        return ans;
    }
    public static void solve(int column, int n, int[] upperdiagnol, int[] lowerdiagnol, int[] leftcolumn, String[][] board, List<List<String>> ans)
    {
        if(column==n)
        {
            List<String> ds=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String curr="";
                for(int j=0;j<n;j++)
                {
                    curr+=board[i][j];
                }
                ds.add(curr);
            }
            ans.add(ds);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(upperdiagnol[n-1+row-column]==0 && lowerdiagnol[row+column]==0 && leftcolumn[row]==0)
            {
                upperdiagnol[n-1+row-column]= 1; 
                lowerdiagnol[row+column]=1;
                leftcolumn[row]=1;
                board[row][column]="Q";
                solve(column+1, n, upperdiagnol, lowerdiagnol, leftcolumn, board, ans );
                board[row][column]=".";
                upperdiagnol[n-1+row-column]= 0; 
                lowerdiagnol[row+column]=0;
                leftcolumn[row]=0;
            }
        }
    }
}