class Solution {
    public boolean isSubsequence(String str1, String str2) {
        int low1=0;
		int high1=str1.length()-1;
		int low2=0;
		int high2=str2.length()-1;
		while(low1<=high1 && low2<=high2)
		{
			if(str1.charAt(low1)==str2.charAt(low2))
			{
				low1++;
			}
			if(str1.charAt(high1)==str2.charAt(high2)&& low2<high2)
			{
				high1--;
			}
			low2++;
			high2--;
		}	
		if(!(low1<=high1))
		return true;

		return false;
    }
}