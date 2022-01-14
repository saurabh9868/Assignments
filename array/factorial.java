package array;

import java.util.Scanner;

public class factorial {
    public static int frequency(int n,int num){
        int count=0;
        while (num>0){
            int a=num%10;
            num=num/10;
            if(n==a){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ch;
       do {
           int n= sc.nextInt();
           int d= sc.nextInt();
           if(frequency(d,n)>0) {
               System.out.println(frequency(d, n));
           }
           else{
               System.out.println("number is not present");
           }
           System.out.println("if want to calculate another enter 1");
           ch= sc.nextInt();

        }while(ch==1);

    }
}
