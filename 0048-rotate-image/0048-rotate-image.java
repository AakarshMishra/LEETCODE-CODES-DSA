class Solution {
    public void rotate(int[][] matrix) {
        int start=0;
        int end=matrix.length-1;
        while(start<end)
        {
            for(int i=0;i<matrix[0].length;i++)
            {
                int temp=matrix[start][i];
                matrix[start][i]=matrix[end][i];
                matrix[end][i]=temp;
            }
            start++;
            end--;
        }
        for(int x=0;x<matrix.length;x++)
        {
            for(int y=x+1;y<matrix[0].length;y++)
            { 
               int temp=matrix[x][y];
                matrix[x][y]=matrix[y][x];
                matrix[y][x]=temp;
            }
        }
    }
}