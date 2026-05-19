class Solution {
    boolean anagram(String s, String t)
    {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray())
        {
            if(!map.containsKey(c)|| map.get(c)<=0)
            {
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        boolean[] done=new boolean[strs.length];
        Arrays.fill(done,false);
        for(int i=0;i<strs.length;i++)
        {
            if(done[i]==false)
            {
                String s=strs[i];
                List<String> list=new ArrayList<>();
                list.add(s);
                for(int j=i+1;j<strs.length;j++)
                {
                    if(anagram(strs[i],strs[j]))
                    {
                        done[j]=true;
                        list.add(strs[j]);
                    }
                }
                ans.add(list);
            }
        }
        return ans;
        
    }
}
