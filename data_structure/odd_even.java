package data_structure;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
