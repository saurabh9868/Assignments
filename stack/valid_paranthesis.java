package stack;

import java.util.Stack;

public class valid_paranthesis {
    public static void main(String[] args) {
        String s="()[()]";
        Stack<Character> stack=new Stack<>();
        boolean is_balanced=true;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if (a == '[' || a == '(' || a =='{') {
                stack.push(a);
            }
            if(stack.empty()){
                is_balanced=false;
                break;
            }
            else if(a==']' && stack.peek()=='['||a=='}' && stack.peek()=='{' || a==')' && stack.peek()=='(' ){
                stack.pop();
            }
        }
        if(!stack.empty()) {
            is_balanced = false;
        }
        System.out.println(is_balanced);
    }
}
