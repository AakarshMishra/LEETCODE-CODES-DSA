class Solution {
    public int pivotIndex(int[] arr) {
        int right=0;
		int left=0;
		for(int x=0;x<arr.length;x++)
		{
			right+=arr[x];
		}
		for(int x=0;x<arr.length;x++)
		{
			right-=arr[x];
			if(left==right)
			return x;
			left+=arr[x];
		}
		return -1;
    }
}