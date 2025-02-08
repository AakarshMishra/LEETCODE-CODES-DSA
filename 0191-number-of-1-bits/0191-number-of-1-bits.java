class Solution {
    public int hammingWeight(int n) {
    String a=Integer.toBinaryString(n);
    System.out.println(a);  
    int c=0;
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)=='1'){
            c++;
        }
    }
     return c;
    }
}