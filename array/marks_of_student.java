package array;

import java.util.Scanner;

public class marks_of_student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        int num=sc.nextInt();
        String result=(num%2==0)? "even" : "odd";
        System.out.println(result);
    }
}
