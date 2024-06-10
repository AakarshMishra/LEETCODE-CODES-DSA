class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
         int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                int diff=1;
                count+=1;
                nums[i]=nums[i]+diff;
            }
            else if(nums[i]<nums[i-1]){
                int diff=Math.abs(nums[i]-nums[i-1])+1;
                count+=diff;
                 nums[i]=nums[i]+diff;
            }
        }
        return count;
    }
}