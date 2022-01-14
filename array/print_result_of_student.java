package array;

import java.util.Scanner;

public class print_result_of_student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=35){
            System.out.println("fail");
        }
        else if(n>=60){
            System.out.println("distinction");
        }
        else{
            System.out.println("pass");
        }
    }
}
