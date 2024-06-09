class Solution {
    public void sortColors(int[] nums) {
        int min=0,max=nums.length-1;
        for(int x=0;x<nums.length;x++)
        {
            if(x>max)
                break;
            if(nums[x]==0)
            {
                int temp=nums[min];
                nums[min]=nums[x];
                nums[x]=temp;
                min++;
            }
            else if(nums[x]==2)
            {
                int temp=nums[max];
                nums[max]=nums[x];
                nums[x]=temp;
                max--;
                x--;
            }
        }
    }
}