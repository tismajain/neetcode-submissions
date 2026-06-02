class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:piles)
        {
            max=Math.max(max,i);
        }
        if(piles.length==h)
        {
            return max;
        }
        int low=1,high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++)
            {
                sum+=Math.ceil((double)piles[i]/mid);
            }
            if(sum<=h)
            {
                min=Math.min(min,mid);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return min;
    }
}
