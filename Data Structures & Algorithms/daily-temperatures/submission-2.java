class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[t.length];
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