package stack;

import java.util.Arrays;
import java.util.Stack;

public class next_greater_element_in_array {
    public static void main(String[] args) {
        int num[]={4,5,7,8,1};
        int num2[]=new int[num.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=num.length-1;i>=0;i--){
            int val=num[i];
            while(!stack.isEmpty() && stack.peek()<=val ){
                stack.pop();
            }
            if(stack.isEmpty()){
                num2[i]=-1;
            }
            else{
                num2[i]=stack.peek();
            }
            stack.push(num[i]);
        }
        System.out.println(Arrays.toString(num2));
    }
}
