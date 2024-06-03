class Solution {
    public String reverseWords(String input) {
         String finals="";
        String word="";
        input=input+" ";
        for(int x=0;x<input.length();x++)
        {
            char ch=input.charAt(x);
            if(ch==' ')
            {
                if(!word.equals(""))
                finals=word+" "+finals;
                word="";
            }
            else
            word+=ch;

        }
        return finals.trim();
    }
}