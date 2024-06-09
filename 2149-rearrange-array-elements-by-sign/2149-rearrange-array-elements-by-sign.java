class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pc=0;
        int nc=0;
        int parr[]=new int[nums.length/2];
        int narr[]=new int[nums.length/2];
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]>0)
            {
                parr[pc]=nums[x];
                pc++;
            }
            else
            {
                narr[nc]=nums[x];
                nc++;
            }
        }
        pc=0;nc=0;
        for(int x=0;x<nums.length;x++)
        {
            if(x%2==0)
            {
                nums[x]=parr[pc];
                pc++;
            }
            else
            {
                nums[x]=narr[nc];
                nc++;
            }
        }
        return nums;
    }
}