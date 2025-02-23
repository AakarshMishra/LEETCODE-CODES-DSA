class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        combination(0,candidates,ds,ans,target);
        return ans;
    }
    public static void combination(int i,int arr[],List<Integer> ds,List<List<Integer>> ans,int target)
    {
        if(i==arr.length)
        {
            if(target==0)
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(arr[i]<=target)
        {
            ds.add(arr[i]);
            combination(i,arr,ds,ans,target-arr[i]);
            ds.remove(ds.size()-1);
        }
        combination(i+1,arr,ds,ans,target);
    }
}