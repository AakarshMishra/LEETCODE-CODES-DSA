class Solution {
    public int maxProfit(int[] prices) {
        int cp=prices[0];
        int sp=prices[0];
        int maxp=0;
        for(int x=0;x<prices.length;x++)
        {
            sp=prices[x];
            if(cp>=sp)
            {
                cp=prices[x];
            }
            else
            {
                int p=sp-cp;
                maxp=maxp<p?p:maxp;
            }

        }
        return maxp;
    }
}