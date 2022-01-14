package array;

import java.util.Scanner;

public class fabonnicci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int a=0;
        int b=1;
        System.out.print(a +",");
        System.out.print(b+",");
        int fabonici=0;
        for (int i=0;i<n-2;i++){
            fabonici=a+b;
            System.out.print(fabonici+",");
            a=b;
            b=fabonici;
        }

    }
}
