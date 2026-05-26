class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int l=0,r=0;
        int k=map.size();
        int min=Integer.MAX_VALUE;
        int start=0,offset=0;

        while(r<s.length())
        {
            char rightChar = s.charAt(r);

            // expand window
            if (map.containsKey(rightChar)) {

                map.put(rightChar, map.get(rightChar) - 1);

                // requirement satisfied exactly
                if (map.get(rightChar) == 0) {
                    k--;
                }
            }

            // shrink window while valid
            while (k == 0) {

                int currentLen = r - l + 1;

                // update minimum answer
                if (currentLen < min) {
                    min = currentLen;
                    start = l;
                }

                char leftChar = s.charAt(l);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    // window becomes invalid
                    if (map.get(leftChar) > 0) {
                        k++;
                    }
                }

                l++;
            }

            r++;
        }

        if (min == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + min);
    }
}
