class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        
        Arrays.sort(nums);
        int left=0,right=0;
        int max=1;
        int skip=0;
        while(left<=right && right<nums.length-1)
        {
            if(nums[right+1]==nums[right])
            {
                skip++;
                right++;
                continue;
            }

            if(nums[right+1]==nums[right]+1)
            {
                right++;
                max=Math.max(max,right-left+1-skip);
            }
            else
            {
                skip=0;
                left=right+1;
                right++;
            }
        }
        return max;
    }
}
