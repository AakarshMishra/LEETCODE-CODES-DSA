class Solution {
    public String reverseVowels(String s) {
       int low=0;
       int high=s.length()-1;
       ArrayList<String> alpha=new ArrayList<>();
       alpha.add("A");
       alpha.add("E");
       alpha.add("I");
       alpha.add("O");
       alpha.add("U");
       String ans="";
       while(low<high)
       {
        char c=s.charAt(low);
        char c1=s.charAt(high);
         if(alpha.contains(Character.toUpperCase(c)+"") && alpha.contains(Character.toUpperCase(c1)+"")) 
         {
            s=s.substring(0,low)+c1+s.substring(low+1,high)+c+s.substring(high+1);
            low++;
            high--;
         }
         else if(alpha.contains(Character.toUpperCase(c)+""))
         high--;
         else
         low++;
       } 
       return s;
    }
}