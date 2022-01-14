package stack;

import java.util.Stack;

public class find_the_redundant_bracket {
    public static void main(String[] args) {
        String s="((a+b)+(a+c))";
        Stack<Character> stack=new Stack<>();
        boolean isredundant=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                int count=0;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                stack.pop();
                if(count==0){
                    isredundant=true;
                }
            }
            else{
                stack.push(c);
            }
        }
        System.out.println(isredundant);
    }
}
