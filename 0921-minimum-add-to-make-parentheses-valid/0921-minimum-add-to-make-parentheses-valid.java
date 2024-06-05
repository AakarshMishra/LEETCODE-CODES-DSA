class Solution {
    public int minAddToMakeValid(String pattern) {
        Stack<Character> s=new Stack<Character>();
		int c=0;
		for(int x=0;x<pattern.length();x++)
		{
		    char ch=pattern.charAt(x);
			if(ch=='(')
			s.push(ch);
			else 
			{
				if(s.empty() || s.pop()!='(')
				c++;
			}
		}
		return c+s.size();
    }
}