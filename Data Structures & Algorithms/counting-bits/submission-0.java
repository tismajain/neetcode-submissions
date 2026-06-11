class Solution {
    public int[] countBits(int num) {
        int[] output=new int[num+1];
        for(int i=1;i<=num;i++)
        {
            int count=0;
            int n=i;
            while(n!=0)
            {
                count+=(n&1);
                n>>=1;
            }
            output[i]=count;
        }
        return output;
    }
}
