class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int left=0,right=0;
        int count=0;
        int i=0,j=0;
        while(count<(n+m)/2+1)
        {
            left=right;
            if(i<m && j<n){
            if(nums1[i]>nums2[j])
            {
                right=nums2[j];
                j++;
            }
            else
            {
                right=nums1[i];
                i++;
            }
            }else if(i<m)
            {
                right=nums1[i++];
            }
            else
            {
                right=nums2[j++];
            }
            count++;
            
        }
        if((n+m)%2!=0)
        {
            return right;
        }
        return (right+left)/2.0;
        
    }
}
