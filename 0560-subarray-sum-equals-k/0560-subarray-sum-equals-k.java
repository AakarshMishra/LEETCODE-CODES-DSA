class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        for(int x=0;x<nums.length;x++)
        {
            sum+=nums[x];
            
            if(sum==k)
            c++;
            if(hm.containsKey(sum-k))
            {
                c+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
            
        }
        return c;
    }
}