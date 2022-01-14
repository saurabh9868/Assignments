package array;

import java.util.Scanner;

public class least_significant_bit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        if((num & 1)==1){
            System.out.println("last bit is 1");
        }
        else{
            System.out.println("last bit is 0");
        }
    }
}
