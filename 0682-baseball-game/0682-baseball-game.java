class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int x=0;x<operations.length;x++)
        {
            switch(operations[x])
            {
                case "C":
                st.pop();
                break;
                case "D":
                st.push(st.peek()*2);
                break;
                case "+":
                int num1=st.pop();
                int num2=st.peek();
                st.push(num1);
                st.push(num1+num2);
                break;
                default:
                st.push(Integer.parseInt(operations[x]));
            }
        }
        int sum=0;
        while(!st.isEmpty())
        sum+=st.pop();
        return sum;
    }
}