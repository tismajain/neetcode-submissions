class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int run=0;
        for(int x: nums)
        {
            run+=x;

        }
        return run==sum ? 0 : sum-run;
    }
}
