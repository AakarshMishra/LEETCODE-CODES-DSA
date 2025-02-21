class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for(int x=0;x<tokens.length;x++)
        {
            int num1=0,num2=0;
            switch(tokens[x])
            {
                case "+":
                    num1=s.pop();
                    num2=s.pop();
                    s.push(num1+num2);
                
                break;
                case "-":
                    num1=s.pop();
                    num2=s.pop();
                    s.push(num2-num1);
                
                break;
                case "*":
                    num1=s.pop();
                    num2=s.pop();
                    s.push(num1*num2);
                  
                break;
                case "/":
                    num1=s.pop();
                    num2=s.pop();
                    s.push(num2/num1);
                break;
                default:
                s.push(Integer.parseInt(tokens[x]));
            
            }
        }
        return s.pop();
    }
}