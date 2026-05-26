class MinStack {

     Stack<Integer> st;
     Stack<Integer> min;
    public MinStack() {
        st=new Stack<>();
        min= new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty())
        {
            min.push(val);
            return;
        }
        else
            min.push(Math.min(val, min.peek()));

    }
    
    public void pop() {
       int x= st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
