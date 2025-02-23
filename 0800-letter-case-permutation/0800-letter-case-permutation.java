class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> arr=new ArrayList<>();
        lettercase(0,"",s,arr);
        return arr;
    }
    public void lettercase(int x,String st,String s,List<String> arr)
    {
        if(st.length()==s.length())
        {
            arr.add(st);
            return;
        }
        if(!Character.isDigit(s.charAt(x)))
        {

            lettercase(x+1,st+s.charAt(x),s,arr);
            lettercase(x+1,st+(char)(s.charAt(x)^32),s,arr);
        }
        else
        {
            lettercase(x+1,st+s.charAt(x),s,arr);
        }
    }
}