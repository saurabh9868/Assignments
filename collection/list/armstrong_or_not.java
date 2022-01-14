package collection.list;

import java.util.Scanner;

public class armstrong_or_not {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        int temp=n;
        while(n>0) {
            sum +=(n%10)*(n%10)*(n%10);
            n=n/10;
        }
        if(sum==temp) {
            System.out.println("Armstrong");}
        else {
            System.out.println("Not Aramstrong");
        }
    }
}
