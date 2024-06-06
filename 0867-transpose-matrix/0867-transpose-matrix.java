class Solution {
    public int[][] transpose(int[][] matrix) {
        int arr[][]=new int[matrix[0].length][matrix.length];
        for(int x=0;x<matrix[0].length;x++)
        {
            for(int y=0;y<matrix.length;y++)
            {
                arr[x][y]=matrix[y][x];
            }
        }
        return arr;
    }
}