class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int l=0, r=0,i=0;
        while(l<=r && r<nums.length && i<n-k+1)
        {
            int max=Integer.MIN_VALUE;
            int t1=l,t2=r;
            while(t2-t1+1<=k)
            {
               max= Math.max(max,nums[t2]);
               t2++;
            }
            ans[i++]=max;
            l++;
            r++;
        }
        return ans;
    }
}
