class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        ArrayList<Integer> al=new ArrayList<>();
        for(int x=0;x<nums.length;x++)
        {
            al.add(nums[x]);
            if(al.contains(target-nums[x]) && x!=al.indexOf(target-nums[x]) )
            {
                arr[0]=x;
                arr[1]=al.indexOf(target-nums[x]);
                break;
            }
        }
        return arr;
    }
}