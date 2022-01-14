package stack;

import java.util.Stack;

public class insert_an_element_at_bottom_of_stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(15);
        stack.push(51);
        stack.push(511);
        stack.push(115);
        stack.push(20);
        int x=10;//element we want to insert at bottom of the stack
        Stack<Integer> stack2=new Stack<>();
        while(!stack.empty()){
            int c=stack.pop();
            stack2.push(c);
        }
        stack.push(x);
        while(!stack2.isEmpty()){
            int d=stack2.pop();
            stack.push(d);
        }
        System.out.println(stack);
    }
}
