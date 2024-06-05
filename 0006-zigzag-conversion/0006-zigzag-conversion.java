class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length())
            return s;
        StringBuilder[] rows=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int cr=0;
        boolean godown=false;
        for(int x=0;x<s.length();x++)
        {
            rows[cr].append(s.charAt(x));
            if(cr==0||cr==numRows-1)
                godown=!godown;
            cr+=godown?1:-1;
        }
        
        StringBuilder result=new StringBuilder();
        for(StringBuilder row:rows)
        {
            result.append(row);
        }
        return result.toString();
    }
}