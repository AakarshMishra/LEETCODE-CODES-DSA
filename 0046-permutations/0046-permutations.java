class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        findP(0,nums,ans);
        return ans;
    }
    public static void findP(int i,int arr[],List<List<Integer>> ans)
    {
        if(i==arr.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int x=0;x<arr.length;x++)
            ds.add(arr[x]);
            ans.add(ds);
            return;
        }
        for(int x=i;x<arr.length;x++)
        {
            swap(i,x,arr);
            findP(i+1,arr,ans);
            swap(i,x,arr);
        }
    }
    public static void swap(int x,int y,int arr[])
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}