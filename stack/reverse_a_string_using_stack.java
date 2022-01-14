package stack;

import java.util.Stack;

public class reverse_a_string_using_stack {
    public static void main(String[] args) {
        String str="saurabh";
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        System.out.println(stack);
        StringBuilder str2=new StringBuilder();
        int size=stack.size();
        for(int i=0;i<size;i++){
            str2.append(stack.pop());
          //  System.out.print(stack.pop()+ "  ");
        }
        System.out.println(str2);
    }
}
