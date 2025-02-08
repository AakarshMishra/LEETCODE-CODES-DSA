class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++)
        {
            String s=Integer.toBinaryString(i);
            int c=0;
            for(int x=0;x<s.length();x++)
            {
                if(s.charAt(x)=='1')
                c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}