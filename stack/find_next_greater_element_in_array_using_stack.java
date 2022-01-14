package stack;

import java.util.Arrays;
import java.util.Stack;

public class find_next_greater_element_in_array_using_stack {
    public static void main(String[] args) {
        int num[]={4,7,3,4,8,1};
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[j]>num[i]){
                   num[i]=num[j];
                    break;
                }
                else if(j==num.length-1){
                    num[i]=-1;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
