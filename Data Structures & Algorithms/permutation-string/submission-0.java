class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            a[s1.charAt(i)-'a']++;
        }
        int l=0,r=0;
        int n=s1.length();
        while(r<s2.length())
        {
            char ch=s2.charAt(r);
            b[ch-'a']++;
            if(r-l+1>n)
            {
                b[s2.charAt(l)-'a']--;
                l++;
            }
            if(r-l+1==n)
            {
                if(Arrays.equals(a,b))
                {
                    return true;
                }
            }
            r++;

        }
        return false;
    }
}
