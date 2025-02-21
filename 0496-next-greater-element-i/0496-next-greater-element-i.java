class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int ar[]=new int[nums1.length];
        for(int x=0;x<nums1.length;x++)
        {
            int c=nums2.length-1;
            Stack<Integer> st=new Stack<>();
            while(nums1[x]!=nums2[c])
            {
                st.push(nums2[c]);
                c--;
            }
            while(!st.isEmpty() && st.peek()<nums1[x])
            {
                st.pop();
            }
            if(st.isEmpty())
            ar[x]=-1;
            else
            ar[x]=st.peek();
        }
        return ar;
    }
}