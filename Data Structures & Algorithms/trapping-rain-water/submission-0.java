class Solution {
    public int trap(int[] height) {
        int left=0,right=height.length-1;
        int leftmax=height[0];
        int rightmax=height[height.length-1];
        int water=0;
        while(left<right)
        {
            if(leftmax<rightmax)
            {
                left++;
                leftmax=Math.max(leftmax,height[left]);
                water+=Math.max(0,Math.min(leftmax,rightmax)-height[left]);
            }
            else
            {
                right--;
                rightmax=Math.max(rightmax,height[right]);
                water+=Math.max(0,Math.min(leftmax,rightmax)-height[right]);
            }

           
            
            

        }

        return water;
    }
}
