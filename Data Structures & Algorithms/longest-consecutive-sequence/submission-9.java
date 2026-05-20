class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        int len=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int val=nums[i];
                len=1;
                while(set.contains(val+1))
                {
                    len++;
                    val++;
                }
            }
            max=Math.max(max,len);
        }
        return max;
    }
}
