/*
goal: constant time
1) we need a new stack minStack to track the min value dynamically
2) based on the above, we can retrieve the min value with O(1) time complexity. Otherwise it's O(n)
3) no need to check if the stack is empty, the problem has clarified its a non-empty stack when calling those methods
4) Leetcode No.4 subimission - solved directly without setting the Integer min

*/

import java.util.Stack;

public class minStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    int min;

    //constructor
    public minStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE; //set the variable of min in the class    
    }
    
    public void push(int val) {
        stack.push(val);

        if (val <= min) {
            minStack.push(val);
            min = val;
        // } else {
        //     minStack.push(min);
        }
        
    }
    
    //remove the top element of the stack
    public void pop() {
       int poppedValue = stack.pop();

       if (poppedValue == min) {
            minStack.pop();

            if (!minStack.isEmpty()) {
                min = minStack.peek();
            } else {
                min = Integer.MAX_VALUE;
            }
       }
   
    }
    
    //gets the top element of the stack
    public int top() {
        int topElement = stack.peek();
        return topElement; 
    }
    
    //retrieves the minimum element in the stack
    public int getMin() {

        return min;
        
    }

}
