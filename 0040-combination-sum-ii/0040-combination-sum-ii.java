class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        combination(0,candidates,ds,ans,target);
        return ans;
    }
    public static void combination(int i,int arr[],List<Integer> ds,List<List<Integer>> ans,int target)
    {
        
         if(target==0)
         {
            ans.add(new ArrayList<>(ds));
            return;
         }
        for(int x=i;x<arr.length;x++)
        {
            if(x>i && arr[x]==arr[x-1])continue;
            if(arr[x]>target)break;
            ds.add(arr[x]);
            combination(x+1,arr,ds,ans,target-arr[x]);
            ds.remove(ds.size()-1);
        }
    }
}