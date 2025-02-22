class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int leftsmall[]=new int[heights.length];
        int rightsmall[]=new int[heights.length];
        for(int x=0;x<heights.length;x++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[x])
            st.pop();
            if(st.isEmpty())
            leftsmall[x]=0;
            else
            leftsmall[x]=st.peek()+1;
            st.push(x);
        }
        while(!st.isEmpty())
        st.pop();
        for(int x=heights.length-1;x>=0;x--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[x])
            st.pop();
            if(st.isEmpty())
            rightsmall[x]=heights.length-1;
            else
            rightsmall[x]=st.peek()-1;
            st.push(x);
        }
        int max=0;
        for(int x=0;x<heights.length;x++)
        {
            max=Math.max((rightsmall[x]-leftsmall[x]+1)*heights[x],max);
        }
        return max;
    }
}