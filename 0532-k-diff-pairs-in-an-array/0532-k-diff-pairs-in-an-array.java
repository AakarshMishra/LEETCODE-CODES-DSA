class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x=0;x<nums.length;x++)
        {
            hm.put(nums[x],hm.getOrDefault(nums[x],0)+1);
        }
        int c=0;
        for(Map.Entry<Integer,Integer> map:hm.entrySet())
        {
            if(k==0)
            {
                if(map.getValue()>1)
                {
                    c++;
                }
            }
            else if(hm.containsKey(k+map.getKey()))
            c++;
        }
        return c;
    }
}