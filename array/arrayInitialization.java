package array;

import java.util.Scanner;

public class arrayInitialization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        double balance[]=new double[n];
        System.out.println("start filling the array");
        for (int i=0;i< balance.length;i++){
            balance[i]= sc.nextDouble();
        }


        for (int i=0;i< balance.length;i++){
            System.out.print(balance[i]+"  ");
        }
    }
}
