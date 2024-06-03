class Solution {
    public boolean checkPossibility(int[] arr) {
        int c=0;
        int n=arr.length;
		for(int x=0;x<(n-1);x++)
		{
			if(!(arr[x]<=arr[x+1]))
			{
				c++;
				if(x>0 && arr[x-1]>arr[x+1])
				{
					arr[x+1]=arr[x];
				}
			
				if(c==2)
				return false;

			}
		}
		return true;
    }
}