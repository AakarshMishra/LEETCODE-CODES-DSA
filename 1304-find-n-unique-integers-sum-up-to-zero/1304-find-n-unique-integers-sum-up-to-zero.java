class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int i=0,j=n-1,c=1;
        while(i!=n/2)
        {
            arr[i]=c;
            arr[j]=0-c;
            c++;
            i++;
            j--;
        }
        if(n%2!=0)
        arr[i]=0;
        return arr;
            
        
    }
}