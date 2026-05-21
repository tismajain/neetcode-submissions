class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0,right=0;
        int max=0;
        while(left<=right && right<s.length())
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);
            }
            else
            {
                while(set.contains(s.charAt(right)))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                max=Math.max(max,right-left+1);
                continue;
            }
            
             right++;
        }
        return max;
    }
}
