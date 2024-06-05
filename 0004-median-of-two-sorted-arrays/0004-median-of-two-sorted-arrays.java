class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0,m1=0,m2=0;
        for(int x=0;x<=(m+n)/2;x++)
        {
            m2=m1;
            if(i!=m && j!=n)
            {
                if(nums1[i]>nums2[j])
                {
                  m1=nums2[j++];  
                }
                else
                {
                    m1=nums1[i++];
                }
            }
            else if(i!=m)
                m1=nums1[i++];
            else if(j!=n)
                m1=nums2[j++];
        }
        if((m+n)%2!=0)
            return (double)m1;
        else
        {
            double res=(double)m1+(double)m2;
            return res/2.0;
        }   
        
    }
}