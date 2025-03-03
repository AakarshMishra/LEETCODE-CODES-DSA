class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int x=0;x<nums.length;x++)
        {
            sum=Math.max(nums[x],sum+nums[x]);
            max=Math.max(sum,max);
        }
        return max;
    }
}