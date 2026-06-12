class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i==digits.length-1)
            {
                carry=(digits[i]+1)/10;
                digits[i]=(digits[i]+1)%10;
                continue;
            }
            if(carry==0)
            {
                break;
            }
            else
            {
                int v=digits[i];
                digits[i]=(digits[i]+carry)%10;
                carry=(v+carry)/10;
                
            }
            
        }
        if(carry!=0)
        {
            int[] ans=new int[digits.length+1];
            ans[0]=carry;
            for(int i=1;i<ans.length;i++)
            {
                ans[i]=digits[i-1];
            }
            return ans;
        }
        return digits;
    }
}
