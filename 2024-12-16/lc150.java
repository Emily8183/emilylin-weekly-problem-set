/*
 * condition: String[] tokens; Reverse Polish Notation
 * solution: stack;
 * 1, iterate the array and push; 
 * 2, once found a arithmetic sign, pop out the two last digits and calculate
 * 3, push the result back to the stack
 */

import java.util.Stack;

public class lc150 {
     public int evalRPN(String[] tokens) {
     Stack<Integer> stack = new Stack<>();

     int result = Integer.valueOf(tokens[0]);
     
     for (int i = 0; i < tokens.length; i++) {
        int num1;
        int num2;

        String c = tokens[i];

        if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
            stack.push(Integer.valueOf(c));
        } else {
            num1 = stack.pop();
            num2 = stack.pop();

            if (c.equals("+")) { 
                result = num1 + num2;
           
            } else if (c.equals("-")) {
                result = num2 - num1;
             
            } else if(c.equals("*")) {
                result = num2 * num1;
               
            } else if(c.equals("/")) {
                result = num2 / num1;
            }

            stack.push(result);
        }
       
     }

     return result;

    }
    
}
