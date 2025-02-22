class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=0;
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x]>nums[x+1])
            {
                c++;
                if(x>0 && nums[x-1]>nums[x+1])
                nums[x+1]=nums[x];
                if(c>1)
                return false;
            }
        }
        
        return true;
    }
}