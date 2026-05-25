class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int left=0,right=0,i=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>( (a, b) -> b[0] - a[0]);
        while(right<nums.length)
        {
            pq.add(new int[]{nums[right],right});
            while (pq.peek()[1] < left) {
                pq.poll();
            }
            if(right-left+1==k){
            ans[i++]=pq.peek()[0];
            left++;
            }
            right++;
        }
        return ans;
    }
}
