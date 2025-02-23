class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1)
        return 1;
        int count[]=new int[n+1];
        for(int x=0;x<trust.length;x++)
        {
            count[trust[x][0]]--;
            count[trust[x][1]]++;
        }
        for(int x=1;x<count.length;x++)
        {
            if(count[x]==n-1)
            return x;}
        return -1;
    }
}