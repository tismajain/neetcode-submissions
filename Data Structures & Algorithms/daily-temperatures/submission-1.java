class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[t.length];
        Arrays.fill(ans,0);
        for(int i=0;i<t.length;i++)
        {
            while(!st.isEmpty() &&t[i]>t[st.peek()])
            {
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
            
        }
        return ans;
    }
}