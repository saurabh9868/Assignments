package array;

import java.util.Scanner;

public class greater_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter the third number");
        int c= sc.nextInt();
        int result=(a>b)? ((a>c)? a:c) :((b>c)? b:c);
        System.out.println(result);
    }
}
