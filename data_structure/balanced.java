import java.util.Scanner;
import java.util.Stack;
public class balanced {
    public static boolean isBalanced(String in)
    {
        Stack<Character> st = new Stack<Character>();

        for(char chr : in.toCharArray())
        {
            switch(chr) {

                case '{':
                case '(':
                case '[':
                    st.push(chr);
                    break;

                case ']':
                    if(st.isEmpty() || st.pop() != '[')
                        return false;
                    break;
                case ')':
                    if(st.isEmpty() || st.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(st.isEmpty() || st.pop() != '{')
                        return false;
                    break;
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        if(s.length() != 0) {
            if(isBalanced(s))
                System.out.println(args[0] + " is balanced");
            else
                System.out.println(args[0] + " is not balanced");
        }
    }
}