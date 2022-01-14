package stack;

import java.util.Arrays;
import java.util.Stack;

public class reverse_a_string_by_using_stack_and_array {
    public static void main(String[] args) {
        String str="saurabh";
        char arr[]=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        for(int i=0; i<arr.length;i++){
            arr[i]= stack.pop();
        }
        arr.toString();
        System.out.println(Arrays.toString(arr));
    }
}
