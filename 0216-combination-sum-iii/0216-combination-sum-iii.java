class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
     List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combination(1,k,ds,ans,n);
        return ans;
    }
    public static void combination(int i,int k,List<Integer> ds,List<List<Integer>> ans,int target)
    {
        if(ds.size()==k)
        {
         if(target==0)
         {
            ans.add(new ArrayList<>(ds));
         }
         return;
        }
        for(int x=i;x<10;x++)
        {
            if(x>target)break;
            ds.add(x);
            combination(x+1,k,ds,ans,target-x);
            ds.remove(ds.size()-1);
        }
    }
}