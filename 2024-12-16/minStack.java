/*
goal: constant time

*/

import java.util.Stack;

public class minStack {

    Stack<Integer> stack;

    int min;

    public minStack() {
        stack = new Stack<>();
               
    }
    
    public void push(int val) {
        stack.push(val);
        
    }
    
    //remove the top element of the stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        } else {
            return;
        }
   
    }
    
    //gets the top element of the stack
    public int top() {
        int top;

        if (!stack.isEmpty()) {
            top = stack.peek();
        } else {
            return null; //how to return 
        }
        
    }
    
    public int getMin() {
        min = Integer.MAX_VALUE;
        int topNum = stack.top();
        int total = stack.size();

        if (stack.isEmpty()) return null; //how to return if stack is empty

        while (!stack.isEmpty()) {
            min = Math.min(min, topNum);
            total--;
        }

        return min;
        
    }


    
}
