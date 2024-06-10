class Solution {
    public int firstUniqChar(String str) {
        HashMap<Character,Integer>hs = new HashMap<>();
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
		   if(hs.containsKey(ch))
		   {
			   hs.put(ch,hs.get(ch)+1);
		   }
		   else{
			   hs.put(ch,1);
		   }
        }
		for(int x=0;x<str.length();x++)
		{
			char ch=str.charAt(x);
			if(hs.get(ch)==1)
			return x;
		}
		return -1;
    }
}