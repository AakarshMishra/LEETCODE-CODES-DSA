class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])
            return nums[nums.length-1];
        for(int x=1;x<nums.length;x+=2)
        {
            if(nums[x]!=nums[x-1])
                return nums[x-1];
        }
        return -1;
    }
}