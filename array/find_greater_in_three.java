package array;

import java.util.Scanner;

public class find_greater_in_three {
    public static int greater(int a,int b,int c){
        int d=0;
        if(a>b && a>c){
            d=a;
        }
        if(b>a && b>c){
            d=b;
        }
        else{
            d=c;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch;
        do {
            System.out.println("enter first number");
            int a = sc.nextInt();
            System.out.println("enter second number");
            int b = sc.nextInt();
            System.out.println("enter third number");
            int c = sc.nextInt();
            System.out.println("the greater from all these three numbers is "+greater(a, b, c));
            System.out.println("if you want to continue enter 1");
            ch = sc.nextInt();
        }while(ch==1);

    }
}
