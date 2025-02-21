class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
       String first = "qwertyuiop";
       String secound ="asdfghjkl";
       String third="zxcvbnm";
       for(String i : words){
        if(row(i,first) || row(i,secound) || row(i,third))
         ans.add(i);
       } 
       return ans.toArray(new String[0]);
    }
    private boolean row(String s,String rows){
      for(char c:s.toCharArray()){
        if(rows.indexOf(Character.toLowerCase(c))==-1){
            return false;
        }
      }
      return true;
    }
}