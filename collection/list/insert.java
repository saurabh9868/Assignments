package collection.list;

import java.util.Stack;

public class insert {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(5);
        stack.push(52);
        stack.push(56);
        stack.push(12);
        stack.push(8);
        stack.pop();
        System.out.println(stack.pop()
        );
        System.out.println(stack);

    }
}
