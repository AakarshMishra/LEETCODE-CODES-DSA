class Solution {
    public void getAllSubsets(int[] nums,int index ,List<List<Integer>> ans, List<Integer>list){
        if(index >= nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]); 
        getAllSubsets(nums , index + 1 , ans , list);
        list.remove(list.size() - 1);
        getAllSubsets(nums , index+ 1 , ans , list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getAllSubsets(nums , 0 , ans , list);
        return ans;
    }
}