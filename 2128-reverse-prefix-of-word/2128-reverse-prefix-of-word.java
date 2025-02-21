class Solution {
    public String reversePrefix(String word, char ch) {
        String result="";
        int x=0;
        while(true)
        {
            char ch1=word.charAt(x);
            result=ch1+result;
            if(ch==ch1)
            break;
            x++;
            if(x>=word.length())
            return word;
        }
        result+=word.substring(x+1);
        return result;
    }
}