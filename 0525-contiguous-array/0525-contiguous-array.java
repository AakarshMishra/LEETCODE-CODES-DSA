class Solution {
    public int findMaxLength(int[] nums) {
       int difference=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                difference--;
            }
            else{
                difference++;
            }
            
            if(hm.containsKey(difference)){
                ans=Math.max(ans,i-hm.get(difference));
            }
            else{
                hm.put(difference,i);
            }
        }
        return ans;
    }
}