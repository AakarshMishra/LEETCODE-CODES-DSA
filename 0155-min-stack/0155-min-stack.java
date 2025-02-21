class MinStack {
    Stack<Integer> st;
    Stack<Integer> min;
    public MinStack() {
           st=new Stack<>();
           min=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty())
        min.push(val);
        else if(min.peek()>=val)
        min.push(val);
    }
    
    public void pop() {
        int min1=st.pop();
        if(min1==min.peek())
        min.pop();
    }
    
    public int top() {
        if(st.isEmpty())
        return -1;
        return st.peek();
    }
    
    public int getMin() {
        if(min.isEmpty())
        return -1;
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */