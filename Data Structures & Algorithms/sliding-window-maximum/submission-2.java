class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
         PriorityQueue<int[]> pq =
            new PriorityQueue<>(
                (a, b) -> b[0] - a[0]
            );

        int left = 0;
        int right = 0;
        int i = 0;

        while (right < n) {

            // Add current element
            pq.add(new int[]{nums[right], right});

            // Window reached size k
            if (right - left + 1 == k) {

                // Remove outdated elements
                while (pq.peek()[1] < left) {
                    pq.poll();
                }

                // Maximum of current window
                ans[i] = pq.peek()[0];

                i++;

                // Slide window
                left++;
            }

            right++;
        }
        return ans;

    }
}
