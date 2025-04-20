class Solution {
    public int myAtoi(String s) {
        long sum=0;
        s=s.trim();
        int x=0;
        int sign=1;
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '-') { sign = -1; x++; }
        else if (s.charAt(0) == '+') { x++; }
        for(;x<s.length();x++)
        {
            char ch=s.charAt(x);
            if(Character.isDigit(ch))
            {
                sum=sum*10+(ch-'0');
                if(sum*sign>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
                if(sum*sign <Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            }
            else if(!Character.isDigit(ch))
            break;
        }
        return (int)(sign*sum);
    }
}