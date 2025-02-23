class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        char curr=s.charAt(0);
        if(k==1&& s.length()==1)
        return true;
        int c=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==curr)
            {
                c++;
            }
            else
            {
                if(c==k)
                {
                    return true;
                }
                c=1;
                curr=s.charAt(i);
            }
        }
        if(c==k)
        return true;
        return false;
    }
}