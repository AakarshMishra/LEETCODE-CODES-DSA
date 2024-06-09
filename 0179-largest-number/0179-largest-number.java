class Solution {
    public String largestNumber(int[] arr) {
        String result="";
        for(int x=0;x<arr.length;x++)
		{
			int i=x;
			for(int y=x+1;y<arr.length;y++)
			{
                String choose=String.valueOf(arr[y])+String.valueOf(arr[i]);
                String loop=String.valueOf(arr[i])+String.valueOf(arr[y]);
				if(choose.compareTo(loop)>0)
				i=y;
			}
			int temp=arr[i];
			arr[i]=arr[x];
			arr[x]=temp;
            result+=String.valueOf(arr[x]);
		}
        if(result.charAt(0)=='0')
            return "0";
    
        return result;
    }
}