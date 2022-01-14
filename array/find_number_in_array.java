package array;

import java.util.Scanner;

public class find_number_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int a = sc.nextInt();
        int num[]=new int[a];
        System.out.println("enter the values");
        for(int j=0;j<a;j++){
            num[j]= sc.nextInt();
        }
        System.out.println("enter the number you want to find");
        int n = sc.nextInt();
        boolean ispresent=false;
        int pos=-1;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                ispresent=true;
                pos=i;
                break;
            }

        }
        if (ispresent){
            System.out.println("number is prresnt at "+pos+"  index");
        }
        else{
            System.out.println("number is not present");
        }
    }
}